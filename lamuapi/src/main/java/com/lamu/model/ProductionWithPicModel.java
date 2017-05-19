package com.lamu.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by songliangliang on 2017/5/16.
 */
public class ProductionWithPicModel implements Serializable {
    private ProductionModel model;
    private List<ProductionPicModel> picModelList;

    public ProductionModel getModel() {
        return model;
    }

    public void setModel(ProductionModel model) {
        this.model = model;
    }

    public List<ProductionPicModel> getPicModelList() {
        return picModelList;
    }

    public void setPicModelList(List<ProductionPicModel> picModelList) {
        this.picModelList = picModelList;
    }
}
