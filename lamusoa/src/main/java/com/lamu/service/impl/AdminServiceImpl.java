package com.lamu.service.impl;

import com.lamu.dao.AdminMapper;
import com.lamu.entity.Admin;
import com.lamu.entity.AdminExample;
import com.lamu.exception.UserNotFoundException;
import com.lamu.model.AdminModel;
import com.lamu.service.AdminService;
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
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public List<AdminModel> adminLogin(String username , String password) {
        AdminExample example = new AdminExample();
        example.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
        List<Admin> admins = adminMapper.selectByExample(example);
        if (admins == null || admins.isEmpty()) {
            throw new UserNotFoundException("user not found !");
        }
        List<AdminModel> models = new ArrayList<>();
        for (Admin admin : admins) {
            AdminModel adminModel = new AdminModel();
            BeanUtils.copyProperties(admin, adminModel);
            models.add(adminModel);
        }
        return models;
    }
}
