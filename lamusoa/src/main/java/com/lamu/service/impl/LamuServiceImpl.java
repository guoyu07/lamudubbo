package com.lamu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lamu.dao.ProductionKindsMapper;
import com.lamu.dao.ProductionMapper;
import com.lamu.dao.ProductionMapperExt;
import com.lamu.dao.ProductionPicMapper;
import com.lamu.entity.*;
import com.lamu.model.ProductionKindsModel;
import com.lamu.model.ProductionModel;
import com.lamu.model.ProductionPicModel;
import com.lamu.model.ProductionWithPicModel;
import com.lamu.service.LamuService;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by songliang on 2016/1/12.
 *
 * @author songliang
 */
@Service("lamuService")
public class LamuServiceImpl implements LamuService {
    private static final Logger LOGGER = Logger.getLogger(LamuServiceImpl.class);
    @Autowired
    private ProductionMapper productionMapper;
    @Autowired
    private ProductionMapperExt productionMapperExt;
    @Autowired
    private ProductionPicMapper productionPicMapper;
    @Autowired
    private ProductionKindsMapper productionKindsMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Integer insertProduction(ProductionModel production) {
        Production production1 = new Production();
        BeanUtils.copyProperties(production, production1);
        productionMapper.insertSelective(production1);
        Integer id = production1.getId();
        return id;
    }

    @Transactional
    public void insertProductionPic(ProductionPicModel productionPicModel) {
        ProductionPic productionPic = new ProductionPic();
        BeanUtils.copyProperties(productionPicModel, productionPic);
        productionPicMapper.insertSelective(productionPic);
    }
    public PageInfo<ProductionModel> getAllLamusByCondition(String name, Date date, Integer curPage, Integer pageSize) {
        PageHelper.startPage(curPage, pageSize);
        ProductionExample example = new ProductionExample();
        example.or().andNameLike(name);
        List<Production> productions = productionMapper.selectByExample(example);
        ArrayList<ProductionModel> models = new ArrayList<>();
        for (Production production : productions) {
            ProductionModel model = new ProductionModel();
            BeanUtils.copyProperties(production, model);
            models.add(model);
        }
        PageInfo<ProductionModel> page = new PageInfo<>(models);
        return page;
    }

    @Override
    public PageInfo<ProductionWithPicModel> condition(Integer category, String unit, String orderBy, Integer curPage, Integer pageSize) {
        List<ProductionWithPicModel> models = new ArrayList<>();
        PageHelper.startPage(curPage, pageSize);
        ProductionExample example = new ProductionExample();
        example.setOrderByClause(orderBy);
        ProductionExample.Criteria criteria = example.or();
        if (category != null) {
            criteria.andCategoryIdEqualTo(category);
        }
        if (unit != null) {
            criteria.andUnitEqualTo(unit);
        }
        List<Production> productions = productionMapper.selectByExample(example);
        for (Production production : productions) {
            ProductionModel productionModel = new ProductionModel();
            BeanUtils.copyProperties(production, productionModel);
            ProductionPicExample picExample = new ProductionPicExample();
            picExample.createCriteria().andProductionIdEqualTo(Long.valueOf(production.getId())).andPicTypeEqualTo(1);
            List<ProductionPic> productionPics = productionPicMapper.selectByExample(picExample);
            List<ProductionPicModel> pics = new ArrayList<>();
            for (ProductionPic productionPic : productionPics) {
                ProductionPicModel productionPicModel = new ProductionPicModel();
                BeanUtils.copyProperties(productionPic, productionPicModel);
                pics.add(productionPicModel);
            }
            ProductionWithPicModel withPicModel = new ProductionWithPicModel();
            withPicModel.setPicModelList(pics);
            withPicModel.setModel(productionModel);
            models.add(withPicModel);
        }
        return new PageInfo<ProductionWithPicModel>(models);
    }

    public ProductionModel select(Integer id) {
        Production production = productionMapper.selectByPrimaryKey(id);
        ProductionModel model = new ProductionModel();
        BeanUtils.copyProperties(production, model);
        return model;
    }

    public List<ProductionPicModel> selectPic(Long id) {
        ProductionPicExample example = new ProductionPicExample();
        example.setOrderByClause("sort asc");
        example.createCriteria().andProductionIdEqualTo(id);
        List<ProductionPic> productionPics = productionPicMapper.selectByExample(example);
        List<ProductionPicModel> models = new ArrayList<>();
        for (ProductionPic productionPic : productionPics) {
            ProductionPicModel model = new ProductionPicModel();
            BeanUtils.copyProperties(productionPic, model);
            models.add(model);

        }
        return models;
    }

    public void updatePic(ProductionPicModel model) {
        ProductionPic productionPic = new ProductionPic();
        BeanUtils.copyProperties(model, productionPic);

        productionPicMapper.updateByPrimaryKeySelective(productionPic);
    }

    public Integer update(ProductionModel lamu) {
        ProductionExample example = new ProductionExample();
        example.createCriteria().andIdEqualTo(lamu.getId());
        Production production = new Production();
        BeanUtils.copyProperties(lamu, production);
        int update = productionMapper.updateByExampleSelective(production, example);
        return update;

    }

    public Integer countRecommand() {
        ProductionExample example = new ProductionExample();
        example.createCriteria().andRecommandEqualTo(1);
        List<Production> productions = productionMapper.selectByExample(example);
        return productions.size();
    }

    public Integer addRecommand(Integer id) {
        Production production = new Production();
        production.setRecommand(1);
        ProductionExample example = new ProductionExample();
        example.createCriteria().andIdEqualTo(id);
        int update = productionMapper.updateByExampleSelective(production, example);
        return update;
    }

    public Integer removeRecommand(Integer id) {
        Production production = new Production();
        production.setRecommand(0);
        ProductionExample example = new ProductionExample();
        example.createCriteria().andIdEqualTo(id);
        int update = productionMapper.updateByExampleSelective(production, example);
        return update;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Integer delete(Integer id) {
        ProductionExample example = new ProductionExample();
        example.createCriteria().andIdEqualTo(id);
        int delete = productionMapper.deleteByExample(example);
        ProductionPicExample picExample = new ProductionPicExample();
        picExample.createCriteria().andProductionIdEqualTo(Long.valueOf(id));
        int picDelete = productionPicMapper.deleteByExample(picExample);
        if (delete == 1 && picDelete == 9) {
            return 1;
        } else {
            return 0;
        }


    }

    public PageInfo<ProductionWithPicModel> getFrontLamuEight() {

        PageHelper.startPage(1, 8);
        List<Production> productions = productionMapper.selectByExample(null);
        List<ProductionWithPicModel> withPicModels = new ArrayList<>();
        for (Production production : productions) {
            ProductionPicExample picExample = new ProductionPicExample();
            picExample.or().andProductionIdEqualTo(Long.valueOf(production.getId())).andPicTypeEqualTo(0);
            List<ProductionPic> pics = productionPicMapper.selectByExample(picExample);
            List<ProductionPicModel> picModels = new ArrayList<>();
            for (ProductionPic pic : pics) {
                ProductionPicModel picModel = new ProductionPicModel();
                BeanUtils.copyProperties(pic, picModel);
                picModels.add(picModel);
            }
            ProductionModel productionModel = new ProductionModel();
            BeanUtils.copyProperties(production, productionModel);
            ProductionWithPicModel withPicModel = new ProductionWithPicModel();
            withPicModel.setModel(productionModel);
            withPicModel.setPicModelList(picModels);
            withPicModels.add(withPicModel);

        }
        PageInfo<ProductionWithPicModel> pageInfo = new PageInfo<>(withPicModels);
        return pageInfo;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<ProductionKindsModel> getKinds() {
        List<ProductionKinds> productionKindss = productionKindsMapper.selectByExample(null);
        List<ProductionKindsModel> models = new ArrayList<>();
        for (ProductionKinds productionKinds : productionKindss) {
            ProductionKindsModel model = new ProductionKindsModel();
            BeanUtils.copyProperties(productionKinds, model);
            models.add(model);
        }
        return models;
    }


}
