package com.zyj.dao;

import com.zyj.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    void save(User user);
    User login(String username, String password);
}
