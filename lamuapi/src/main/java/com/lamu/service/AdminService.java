package com.lamu.service;

import com.lamu.model.AdminModel;

import java.util.List;

/**
 * Created by songliang on 16/6/9.
 */
public interface AdminService {
    /**
     * 管理员登陆
     *
     * @param username       管理员id
     * @param password 管理员密码
     * @return 管理员列表
     */
    public List<AdminModel> adminLogin(String username, String password);
}
