package com.loong.sa.web;

import com.loong.sa.entity.User;
import com.loong.sa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/9/27.
 */

@Controller
@RequestMapping(value = "/user")
@ComponentScan
public class UserController {
    /**
     * 添加用户(该方法用来测试ajax正常调用)
     *
     * @return
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addUser(User user,HttpServletRequest request,
                                       HttpServletResponse response) {

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            userService.saveOrUpdateUser(user);
            map.put("flag", true);
        } catch (Exception e) {
            map.put("flag", false);
        }
        return map;
    }

    /**
     * 获取用户列表()
     *
     * @return
     */
    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getUserList(HttpServletRequest request,
                                           HttpServletResponse response) {
        String sPage = WebUtils.findParameterValue(request, "page");
        String sPageSize = request.getParameter("pageSize");
        int page = Integer.parseInt(sPage);
        int pageSize = Integer.parseInt(sPageSize);
        Map<String, Object> map = new HashMap<String, Object>();
        List<User> userList = userService.getUserList(page, pageSize);
        map.put("userList", userList);
        return map;
    }

    /**
     * 获取用户列表
     *
     * @return
     */
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUserList(HttpServletRequest request) {
        String sPage = WebUtils.findParameterValue(request, "page");
        String sPageSize = request.getParameter("pageSize");
        int page = Integer.parseInt(sPage);
        int pageSize = Integer.parseInt(sPageSize);
        List<User> userList = userService.getUserList(page, pageSize);
        return userList;
    }

    /**
     * 添加用户
     *
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    @ResponseBody
    public List<User> addUser(@RequestBody User user, HttpServletRequest request) {
        String sPage = WebUtils.findParameterValue(request, "page");
        String sPageSize = request.getParameter("pageSize");
        int page = Integer.parseInt(sPage);
        int pageSize = Integer.parseInt(sPageSize);
        userService.saveOrUpdateUser(user);
        List<User> userList = userService.getUserList(page, pageSize);
        return userList;
    }

    /**
     * 更新用户
     *
     * @param user    前台获取用户对象
     * @param request 请求对象
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public List<User> updateUser(@RequestBody User user,
                                 HttpServletRequest request) {
        String sPage = WebUtils.findParameterValue(request, "page");
        String sPageSize = request.getParameter("pageSize");
        int page = Integer.parseInt(sPage);
        int pageSize = Integer.parseInt(sPageSize);
        userService.saveOrUpdateUser(user);
        List<User> list = userService.getUserList(page, pageSize);
        return list;
    }

    /**
     * 删除用户
     *
     * @param request 请求对象
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public List<User> deleteUser(HttpServletRequest request) {
        String userId = request.getParameter("id");
        String sPage = WebUtils.findParameterValue(request, "page");
        String sPageSize = request.getParameter("pageSize");
        int page = Integer.parseInt(sPage);
        int pageSize = Integer.parseInt(sPageSize);
        User user = new User(userId);
        userService.deleteUser(user);
        List<User> list = userService.getUserList(page, pageSize);
        return list;
    }

    /**
     * 用户业务接口
     */
    @Autowired
    private IUserService userService;


    @Bean
    IUserService userService(){

        return new IUserService() {
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
        };
    }
}
