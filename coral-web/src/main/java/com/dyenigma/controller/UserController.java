package com.dyenigma.controller;

import com.dyenigma.api.UserService;
import com.dyenigma.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * coral
 * author: dyenigma
 * create: 2016/4/1 10:06
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    @Qualifier(value = "userService")
    private UserService userService;

    /**
     * 主页面跳转
     * <p>
     * return main.jsp
     */
    @RequestMapping("/")
    public String goIndex() {
        LOGGER.info("");
        return "main";
    }

    /**
     * 新增user
     */
    @RequestMapping("/insert")
    @ResponseBody
    public List<User> insert(String id) {
        User user = new User(Long.parseLong(id), "jack3", 23);
        userService.insert(user);
        return getUsers();
    }


    /**
     * 查询所有用户
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<User> getUsers() {
        return userService.findAll();
    }

    /**
     * 根据id获取user
     * <p>
     * param 用户id
     */
    @RequestMapping("/one")
    @ResponseBody
    public User getUserById(String id) {
        return userService.selectById(Long.valueOf(id));
    }

    /**
     * 根据id删除user
     * <p>
     * param 用户id
     */
    @RequestMapping("/delete")
    @ResponseBody
    public List<User> deleteUserById(String id) {
        userService.delById(Long.valueOf(id));
        return getUsers();
    }

    /**
     * 根据id更新user
     * <p>
     * param 用户id
     */
    @RequestMapping("/updateById")
    @ResponseBody
    public User updateUserById(String id) {
        User user = new User(Long.valueOf(id), "ivan", 30);
        userService.update(user);
        return userService.selectById(Long.valueOf(id));
    }
}
