package com.zyj.controller;

import com.zyj.entity.Item;
import com.zyj.service.ItemService;
import com.zyj.utils.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        String s = Common.recommend;
        String[] idList = s.split(",");
        List<Item> list = new LinkedList<>();
        for(String id : idList){
            list.add(itemService.findById(id));
        }
        model.addAttribute("items", list);
        return "/travel/recommendList";
    }
}
