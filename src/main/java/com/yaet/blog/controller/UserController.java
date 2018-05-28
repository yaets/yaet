package com.yaet.blog.controller;

import com.yaet.blog.pojo.User;
import com.yaet.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/listUser")
    public ModelAndView listUser(ModelAndView modelAndView) {

        List<User> users = userService.list();
        modelAndView.addObject("users", users);

        modelAndView.setViewName("listUser");
        return modelAndView;
    }
}
