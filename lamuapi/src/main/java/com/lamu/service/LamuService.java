package com.lamu.service;

import com.github.pagehelper.PageInfo;
import com.lamu.model.ProductionKindsModel;
import com.lamu.model.ProductionModel;
import com.lamu.model.ProductionPicModel;
import com.lamu.model.ProductionWithPicModel;

import java.util.Date;
import java.util.List;

/**
 * @author: songliang
 * @project: lamu
 * @description:
 * @date: 16/6/9
 */
public interface LamuService {
    /*
    * @param request
    * @param production
    * @param files
    * @param types
    * @return
    */
    public Integer insertProduction(ProductionModel production);

    public void insertProductionPic(ProductionPicModel productionPicModel);

    /**

     * @return
     */
    public PageInfo<ProductionModel> getAllLamusByCondition(String name, Date date, Integer curPage, Integer pageSize);

    PageInfo<ProductionWithPicModel> condition(Integer category, String unit, String orderBy, Integer curPage, Integer pageSize);
    /**
     * @param clone
     * @return
     */

    /**
     * @param id
     * @return
     */
    public ProductionModel select(Integer id);

    /**
     * @return
     */
    public List<ProductionPicModel> selectPic(Long id);


    public void updatePic(ProductionPicModel model);



    /**
     * @param lamu
     * @return
     */
    public Integer update(ProductionModel lamu);

    /**
     * @return
     */
    public Integer countRecommand();

    /**
     * @param id
     * @return
     */
    public Integer addRecommand(Integer id);

    /**
     * @param id
     * @return
     */
    public Integer removeRecommand(Integer id);

    /**
     * @param id
     * @return
     */
    public Integer delete(Integer id);

    /**
     * @return
     */
    public PageInfo<ProductionWithPicModel> getFrontLamuEight();

    /**
     * @return
     */
    public List<ProductionKindsModel> getKinds();

}
