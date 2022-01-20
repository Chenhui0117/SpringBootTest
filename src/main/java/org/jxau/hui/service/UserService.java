package org.jxau.hui.service;

import org.jxau.hui.entity.User;
import org.jxau.hui.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Huihui
 * @date 2021/12/15 13:53
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

}
