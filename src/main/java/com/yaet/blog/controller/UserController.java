package com.yaet.blog.controller;

import com.yaet.blog.pojo.User;
import com.yaet.blog.redis.RedisRepository;
import com.yaet.blog.redis.impl.UserRedisRepository;
import com.yaet.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView listUser(ModelAndView modelAndView) {

        List<User> users = userService.list();
        modelAndView.addObject("users", users);

        modelAndView.setViewName("listUser");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login_get(ModelAndView modelAndView) {

        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login_put(ModelAndView modelAndView) {

        modelAndView.setViewName("home");
        return modelAndView;
    }
}
