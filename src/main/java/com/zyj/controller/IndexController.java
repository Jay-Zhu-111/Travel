package com.zyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String map(){
        return "/travel/map";
    }
}
