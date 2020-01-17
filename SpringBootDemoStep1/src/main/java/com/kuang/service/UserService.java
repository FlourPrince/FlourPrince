package com.kuang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kuang.dao.User;

public interface UserService {

    public User getUser(int xuhao);
    
    public List<User> getUserAll();


}