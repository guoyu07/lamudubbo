package com.lamu.dao;

import com.lamu.entity.Gallery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by songliang on 2016/1/7.
 *
 * @author songliang
 */
public interface GalleryMapperExt {
    public List<Gallery> getGallerysByLimit(@Param("offset") int offset, @Param("limit") int limit);
}
