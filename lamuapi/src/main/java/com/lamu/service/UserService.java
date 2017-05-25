package com.lamu.service;

import com.lamu.model.UserMessageModel;
import com.lamu.model.UserModel;

import java.util.List;

/**
 * Created by songliangliang on 2017/5/24.
 */
public interface UserService {
    UserModel login(String username, String password);

    List<UserMessageModel> queryMessage(Integer userId, Integer curPage, Integer pageSize);

    UserModel getUserById(Integer id);

    /**
     * 注册
     * @param userModel
     */
    void register(UserModel userModel);

    /**
     * modify user password
     * @param id
     * @param oldPassword
     * @param newPassword
     * @param repeatNewPassword
     */
    void updatePassword(String id,String oldPassword,String newPassword,String repeatNewPassword);

    /**
     * update user info
     * @param userModel
     */
    void  updateUserInfo(String userModel);

}
