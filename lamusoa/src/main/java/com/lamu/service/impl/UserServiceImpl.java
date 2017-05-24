package com.lamu.service.impl;

import com.github.pagehelper.PageHelper;
import com.lamu.dao.UserMapper;
import com.lamu.dao.UserMessageMapper;
import com.lamu.entity.User;
import com.lamu.entity.UserExample;
import com.lamu.entity.UserMessage;
import com.lamu.entity.UserMessageExample;
import com.lamu.model.UserMessageModel;
import com.lamu.model.UserModel;
import com.lamu.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songliangliang on 2017/5/24.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMessageMapper userMessageMapper;

    @Override
    public UserModel login(String username, String password) {
        UserExample example = new UserExample();
        example.or().andNameEqualTo(username).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(example);
        if (users.isEmpty()) {
            return null;
        } else {
            User user = users.get(0);
            UserModel userModel = new UserModel();
            BeanUtils.copyProperties(user, userModel);
            userModel.setPassword(null);
            return userModel;
        }
    }

    public List<UserMessageModel> queryMessage(String userId, Integer curPage, Integer pageSize) {
        List<UserMessageModel> models = new ArrayList<>();
        PageHelper.startPage(curPage, pageSize);
        UserMessageExample example = new UserMessageExample();
        example.createCriteria().andUuidEqualTo(userId);
        example.setOrderByClause("date desc");
        List<UserMessage> userMessages = userMessageMapper.selectByExample(example);
        for (UserMessage message : userMessages) {
            UserMessageModel userMessageModel = new UserMessageModel();
            BeanUtils.copyProperties(message, userMessageModel);
            models.add(userMessageModel);
        }
        return models;
    }
}
