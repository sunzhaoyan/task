package com.szy.task.service;

import com.szy.task.common.Page;
import com.szy.task.model.User;

import java.util.List;

/**
 * @Description:
 * @Author: sunzhaoyan
 * @CreateDate: 2018-05-15 23:18
 * @Version: 1.0
 **/
public interface UserService {
    List<User> findAll(Page page);

    int add(User userInfo);
}
