package com.lamu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lamu.dao.GalleryMapper;
import com.lamu.dao.GalleryMapperExt;
import com.lamu.entity.Gallery;
import com.lamu.entity.GalleryExample;
import com.lamu.model.GalleryModel;
import com.lamu.service.GalleryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songliang on 2016/1/6.
 *
 * @author songliang
 */
@Service("galleryService")
public class GalleryServiceImpl implements GalleryService {
    @Autowired
    private GalleryMapper galleryMapper;
    @Autowired
    private GalleryMapperExt galleryMapperExt;

    public List<GalleryModel> getAllGalleryPics() {
        GalleryExample example = new GalleryExample();
        example.setOrderByClause("date desc");
        List<Gallery> gallerypics = galleryMapper.selectByExample(example);
        List<GalleryModel> models = new ArrayList<>();
        for (Gallery gallery : gallerypics) {
            GalleryModel galleryModel = new GalleryModel();
            BeanUtils.copyProperties(gallery, galleryModel);
            models.add(galleryModel);
        }
        return models;
    }

    public Integer insertGallery(GalleryModel gallery) {
        Gallery gallery1 = new Gallery();
        BeanUtils.copyProperties(gallery, gallery1);
        int insert = galleryMapper.insert(gallery1);
        return insert;
    }

    public PageInfo<GalleryModel> getGallerysByPage(Integer currentPage) {
        PageHelper.startPage(1, 4);
        List<GalleryModel> allGalleryPics = getAllGalleryPics();
        PageInfo<GalleryModel> pageInfo = new PageInfo<>();
        pageInfo.setList(allGalleryPics);
        return pageInfo;
    }

    public GalleryModel getGalleryById(Long id) {
        Gallery gallery = galleryMapper.selectByPrimaryKey(id);
        GalleryModel model = new GalleryModel();
        BeanUtils.copyProperties(gallery, model);
        return model;
    }

    public Integer addRecommand(Long id) {
        GalleryExample example = new GalleryExample();
        example.createCriteria().andIdEqualTo(id);
        Gallery gallery = new Gallery();
        gallery.setRecommand(1);
        int update = galleryMapper.updateByExampleSelective(gallery, example);
        return update;
    }

    public Integer removeRecommand(Long id) {
        GalleryExample example = new GalleryExample();
        example.createCriteria().andIdEqualTo(id);
        Gallery gallery = new Gallery();
        gallery.setRecommand(0);
        int update = galleryMapper.updateByExampleSelective(gallery, example);
        return update;
    }

    public Long countRecommand() {
        GalleryExample example = new GalleryExample();
        example.createCriteria().andRecommandEqualTo(1);
        return galleryMapper.countByExample(example);
    }

    public Integer delete(Long id) {
        return galleryMapper.deleteByPrimaryKey(id);
    }

    public List<GalleryModel> getFrontGallery() {
        GalleryExample example = new GalleryExample();
        example.createCriteria().andRecommandEqualTo(1);
        List<Gallery> galleries = galleryMapper.selectByExample(example);
        ArrayList<GalleryModel> models = new ArrayList<>();
        for (Gallery gallery : galleries) {
            GalleryModel model = new GalleryModel();
            BeanUtils.copyProperties(galleries, model);
            models.add(model);
        }
        return models;
    }
}
