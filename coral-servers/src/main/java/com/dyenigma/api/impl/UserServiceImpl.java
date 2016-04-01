package com.dyenigma.api.impl;

import com.dyenigma.api.UserService;
import com.dyenigma.dao.UserMapper;
import com.dyenigma.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * coral
 * author: dyenigma
 * create: 2016/4/1 9:04
 */
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        LOGGER.info("添加用户:" + user.toString());
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        LOGGER.info("更新用户:" + user.toString());
        return userMapper.update(user);
    }

    @Override
    public int delById(long id) {
        LOGGER.info("删除用户:ID=" + id);
        return userMapper.delById(id);
    }

    @Override
    public User selectById(long id) {
        LOGGER.info("查找用户:ID=" + id);
        return userMapper.selectById(id);
    }

    @Override
    public List<User> findAll() {
        LOGGER.info("查找所有用户");
        return userMapper.findAll();
    }

    @Override
    public User findById(long id) {
        LOGGER.info("查找用户：ID=" + id);
        return userMapper.findById(id);
    }
}
