package com.zyj.service.impl;

import com.zyj.dao.ItemDao;
import com.zyj.entity.Item;
import com.zyj.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Item> findAll() {
        return itemDao.findAll();
    }

    @Override
    public Item findById(String id) {
        return itemDao.findById(id);
    }
}
