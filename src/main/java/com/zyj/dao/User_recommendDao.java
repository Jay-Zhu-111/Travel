package com.zyj.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface User_recommendDao {
    String findRecommendByUserPlace(String username, String placename);
}
