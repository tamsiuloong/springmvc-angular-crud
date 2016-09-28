package com.loong.sa.service.impl;

import com.loong.sa.entity.User;
import com.loong.sa.service.IUserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/9/28.
 */
@Component
public class UserServiceImpl implements IUserService {

    List<User> result = new ArrayList<User>();
    {
        result.add(new User("1","jay"));
        result.add(new User("2","andy"));
    }
    public void deleteUser(User user) {
        System.out.println("deleteUser");
        result.remove(user);
    }

    public List<User> getUserList(int page, int pageSize) {

        return result;
    }

    public void saveOrUpdateUser(User user) {
        System.out.println("saveOrUpdateUser");
        result.add(user);
    }
}
