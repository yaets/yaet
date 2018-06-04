package com.yaet.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping("")
public class HomeController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Resource(name="redisTemplate")
    private ListOperations<String ,String > listOps;

    @RequestMapping("/")
    public ModelAndView toHome(ModelAndView modelAndView) {
        listOps.size("abcde");
        redisTemplate.dump("abc");
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
