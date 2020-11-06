package com.zyj.controller;

import com.zyj.entity.Item;
import com.zyj.service.ItemService;
import com.zyj.service.User_recommendService;
import com.zyj.utils.Common;
import org.apache.ibatis.javassist.CodeConverter;
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

    @Autowired
    private User_recommendService user_recommendService;

    @GetMapping("/beijing")
    public String beijing(Model model){
        String placename = "北京";
        model.addAttribute("placename", placename);
        List<Item> list = findByPlace(placename);
        Common.recommendList = list;
        model.addAttribute("items", list);
        return "/travel/recommendList";
    }

    @GetMapping("/kanasi")
    public String kanasi(Model model){
        String placename = "喀纳斯";
        model.addAttribute("placename", placename);
        List<Item> list = findByPlace(placename);
        Common.recommendList = list;
        model.addAttribute("items", list);
        return "/travel/recommendList";
    }

    @GetMapping("/nyc")
    public String nyc(Model model){
        String placename = "纽约";
        model.addAttribute("placename", placename);
        List<Item> list = findByPlace(placename);
        Common.recommendList = list;
        model.addAttribute("items", list);
        return "/travel/recommendList";
    }

    private List<Item> findByPlace(String placename){
        String userName = Common.user.getName();

        String recommend = user_recommendService.findRecommendByUserPlace(userName, placename);
        String[] idList = recommend.split(",");

        List<Item> list = new LinkedList<>();
        for(String id : idList){
            list.add(itemService.findById(id));
        }

        return list;
    }
}
