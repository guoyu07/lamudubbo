package com.lamu.service;

import com.lamu.model.UserMessageModel;
import com.lamu.model.UserModel;

import java.util.List;

/**
 * Created by songliangliang on 2017/5/24.
 */
public interface UserService {
    UserModel login(String username, String password);

    List<UserMessageModel> queryMessage(String userId, Integer curPage, Integer pageSize);
}
