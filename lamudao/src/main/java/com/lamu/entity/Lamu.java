package com.lamu.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/1/19.
 */
public class Lamu extends Production implements Serializable {
    private String picAddr;

    public String getPicAddr() {
        return picAddr;
    }

    public void setPicAddr(String picAddr) {
        this.picAddr = picAddr;
    }
}
