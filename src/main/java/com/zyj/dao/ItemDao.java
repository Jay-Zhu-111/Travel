package com.zyj.dao;

import com.zyj.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDao {

    List<Item> findAll();
    Item findById(String id);
}
