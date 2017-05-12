package com.lamu.service;

import com.github.pagehelper.PageInfo;
import com.lamu.model.ProductionKindsModel;
import com.lamu.model.ProductionModel;
import com.lamu.model.ProductionPicModel;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
    public void insertProduction(ProductionModel production, ProductionPicModel productionPicModel);


    /**

     * @return
     */
    public PageInfo<ProductionModel> getAllLamusByCondition(String name, Date date, Integer curPage, Integer pageSize);

    /**
     * @param clone
     * @return
     */

    /**
     * @param id
     * @return
     */
    public ProductionModel select(String id);

    /**
     * @return
     */
    public List<ProductionPicModel> selectPic(String id);


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
    public Integer addRecommand(String id);

    /**
     * @param id
     * @return
     */
    public Integer removeRecommand(String id);

    /**
     * @param id
     * @return
     */
    public Integer delete(String id);

    /**
     * @return
     */
    public Map<ProductionModel, ProductionPicModel> getFrontLamuEight();

    /**
     * @return
     */
    public List<ProductionKindsModel> getKinds();

}
