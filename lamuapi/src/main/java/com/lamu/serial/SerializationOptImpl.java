package com.lamu.serial;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lamu.exception.LamuException;
import com.lamu.exception.UserNotFoundException;
import com.lamu.model.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by songliangliang on 16/10/21.
 */
public class SerializationOptImpl implements SerializationOptimizer {
    public Collection<Class> getSerializableClasses() {
        List<Class> list = new LinkedList<Class>();
        list.add(Void.class);
        list.add(Double.class);
        list.add(Page.class);
        list.add(PageInfo.class);
        list.add(AdminModel.class);
        list.add(AnnouncementModel.class);
        list.add(BookModel.class);
        list.add(CommentModel.class);
        list.add(GalleryModel.class);
        list.add(LamuModel.class);
        list.add(ProductionKindsModel.class);
        list.add(ProductionModel.class);
        list.add(ProductionPicModel.class);
        list.add(ProductionSaledModel.class);
        list.add(ProductionStockModel.class);
        list.add(SystemModel.class);
        list.add(UserMessageModel.class);
        list.add(UserModel.class);
        list.add(LamuException.class);
        list.add(UserNotFoundException.class);
        list.add(ProductionWithPicModel.class);
        list.add(List.class);
        return list;
    }
}