package com.ford.helloworld.service;

import com.ford.helloworld.entity.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @author: Ford.Zhang
 * @version: 1.0
 * 2019/12/26 上午 10:44
 **/
public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User delete(Long id);
}
