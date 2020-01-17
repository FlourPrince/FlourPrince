package com.kuang.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuang.dao.User;
import com.kuang.dao.UserMapper;
@Service
public class USerServiceImpl implements UserService {
	@Autowired
    UserMapper userMapper;

    public User getUser(int xuhao) {
        return userMapper.getUser(xuhao);
    }
    
    
    public List<User> getUserAll() {
        return userMapper.getUserAll();
    }
    
}
