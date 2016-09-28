package com.loong.sa.web;

import com.loong.sa.entity.User;
import junit.framework.Assert;
import org.junit.Test;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/9/28.
 */
public class UserControllerTest {

    @Test
    public void test() {
        User user = new User();
        user.setAddress("haha");
        user.setEmail("damn");
        user.setId("1");
        Assert.assertNull(user);
    }

    @Test
    public void tes2t() {
        System.out.println("hello");
    }

    @Test
    public void test3() {
        System.out.println("hello");
    }

    @Test
    public void test4() {
        System.out.println("hello");
    }

    @Test
    public void test5() {
        System.out.println("hello");
    }

    @Test
    public void test6() {
        System.out.println("hello");
    }

}
