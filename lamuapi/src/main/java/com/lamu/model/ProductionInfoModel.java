package com.lamu.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by songl on 2017/6/3.
 */
public class ProductionInfoModel implements Serializable {
    private ProductionModel productionModel;
    private List<ProductionPicModel> shortPics;
    private List<ProductionPicModel> infoPics;

    public ProductionModel getProductionModel() {
        return productionModel;
    }

    public void setProductionModel(ProductionModel productionModel) {
        this.productionModel = productionModel;
    }

    public List<ProductionPicModel> getShortPics() {
        return shortPics;
    }

    public void setShortPics(List<ProductionPicModel> shortPics) {
        this.shortPics = shortPics;
    }

    public List<ProductionPicModel> getInfoPics() {
        return infoPics;
    }

    public void setInfoPics(List<ProductionPicModel> infoPics) {
        this.infoPics = infoPics;
    }
}
