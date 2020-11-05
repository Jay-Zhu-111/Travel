package com.zyj.service;

import com.zyj.entity.Item;

import java.util.List;

public interface ItemService {

    List<Item> findAll();

    Item findById(String id);
}
