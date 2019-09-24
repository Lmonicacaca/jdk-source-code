package com.jdk_source_code.demo.service.impl;

import com.jdk_source_code.demo.dao.database1.UserMapper;
import com.jdk_source_code.demo.domain.UserDO;
import com.jdk_source_code.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lilin
 * @date 2019-09-24
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public UserDO getUserDOById(Integer userId) {
        UserDO userDO = new UserDO();
        userDO.setUserId(userId);
        return userMapper.selectByPrimaryKey(userDO);
    }
}
