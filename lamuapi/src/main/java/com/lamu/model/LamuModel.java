package com.lamu.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/1/19.
 */
public class LamuModel extends ProductionModel implements Serializable {
    private String picAddr;

    public String getPicAddr() {
        return picAddr;
    }

    public void setPicAddr(String picAddr) {
        this.picAddr = picAddr;
    }
}
