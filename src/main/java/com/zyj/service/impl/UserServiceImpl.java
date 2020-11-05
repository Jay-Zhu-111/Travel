package com.zyj.service.impl;

import com.zyj.dao.UserDao;
import com.zyj.entity.User;
import com.zyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        user.setRecommend("userrecommendSet in userservice");
        userDao.save(user);
    }

    @Override
    public User login(String username, String password) {
        return userDao.login(username, password);
    }
}
