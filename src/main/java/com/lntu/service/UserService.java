package com.lntu.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lntu.entity.User;

/**
 * 用户服务
 * Created by lx-pc on 2018/4/15.
 */
public interface UserService {
    // 添加用户
    String add(User user) throws JsonProcessingException;
}
