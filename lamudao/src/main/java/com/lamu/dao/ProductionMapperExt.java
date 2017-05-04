package com.lamu.dao;

import com.lamu.entity.Production;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by songliang on 2016/1/14.
 *
 * @author songliang
 */
public interface ProductionMapperExt {
    public List<Production> getAllLamusByCondition(@Param("condition") Map jsonObject);

    public List<Production> getAllLamusByConditionWithoutLimit(@Param("condition") Map jsonObject);
}
