package com.lamu.service;

import com.github.pagehelper.PageInfo;
import com.lamu.model.GalleryModel;

import java.util.List;

/**
 * @author: songliang
 * @project: lamu
 * @description:
 * @date: 16/6/9
 */
public interface GalleryService {
    /**
     * @return
     */
    public List<GalleryModel> getAllGalleryPics();

    /**
     * @param gallery
     * @return
     */
    public Integer insertGallery(GalleryModel gallery);

    /**
     * @param currentPage
     * @return
     */

    public PageInfo<GalleryModel> getGallerysByPage(Integer currentPage);

    /**
     * @param id
     * @return
     */
    public GalleryModel getGalleryById(String id);

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
     * @return
     */
    public Integer countRecommand();

    /**
     * @param id
     * @return
     */
    public Integer delete(String id);

    /**
     * @return
     */
    public List<GalleryModel> getFrontGallery();


}
