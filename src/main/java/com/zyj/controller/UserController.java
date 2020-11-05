package com.zyj.controller;

import com.zyj.entity.User;
import com.zyj.service.UserService;
import com.zyj.service.User_recommendService;
import com.zyj.utils.Common;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(User user){
        userService.register(user);
        return "redirect:/index";
    }

    @PostMapping("/login")
    public String login(@Param("username") String username, @Param("password") String password){
        User user = userService.login(username, password);

        if(user != null){
            Common.user = user;
            return "redirect:/travel";
        }
        else{
            System.out.println("can't find user:  "+ username +"  " + password);
            return "redirect:/index";
        }
    }
}
