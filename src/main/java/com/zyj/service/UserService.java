package com.zyj.service;

import com.zyj.entity.User;

public interface UserService {

    void register(User user);
    User login(String username, String password);
}
