package com.zyj.controller;

import com.zyj.entity.Item;
import com.zyj.utils.Common;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String toIndex(){
        return "/travel/index";
    }

    @GetMapping("/travel")
    public String toTravel(){
        return "/travel/travel";
    }

    @GetMapping("/toLogin")
    public String toLogin(){
        return "/travel/login";
    }

    @GetMapping("/toRegister")
    public String toRegister(){
        return "/travel/register";
    }

    @GetMapping("/map")
    public String map(Model model){
        List<String> longitudes = new LinkedList<>();
        List<String> latitudes = new LinkedList<>();
        for(Item item : Common.recommendList){
            longitudes.add(item.getLongitude());
            latitudes.add(item.getLatitude());
        }
        model.addAttribute("longitudes", longitudes);
        model.addAttribute("latitudes", latitudes);
        return "/travel/map";
    }
}
