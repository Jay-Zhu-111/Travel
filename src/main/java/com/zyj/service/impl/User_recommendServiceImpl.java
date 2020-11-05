package com.zyj.service.impl;

import com.zyj.dao.User_recommendDao;
import com.zyj.service.User_recommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class User_recommendServiceImpl implements User_recommendService {

    @Autowired
    User_recommendDao user_recommendDao;

    @Override
    public String findRecommendByUserPlace(String username, String placename) {
        return user_recommendDao.findRecommendByUserPlace(username, placename);
    }
}
