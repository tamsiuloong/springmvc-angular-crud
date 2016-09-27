package com.loong.sa.service;

import com.loong.sa.entity.User;

import java.util.List;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/9/27.
 */
public interface IUserService {
    void deleteUser(User user);

    List<User> getUserList(int page, int pageSize);

    void saveOrUpdateUser(User user);
}
