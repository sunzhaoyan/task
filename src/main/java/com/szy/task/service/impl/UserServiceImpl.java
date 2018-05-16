package com.szy.task.service.impl;

import com.github.pagehelper.PageHelper;
import com.szy.task.common.Page;
import com.szy.task.mapper.UserMapper;
import com.szy.task.model.User;
import com.szy.task.model.UserExample;
import com.szy.task.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: sunzhaoyan
 * @CreateDate: 2018-05-15 23:20
 * @Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll(Page page) {
        if (page.checkVaild()) {
            PageHelper.startPage(page.getPageNum(), page.getPageSize());
        }
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }
}
