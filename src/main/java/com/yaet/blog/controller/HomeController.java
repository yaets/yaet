package com.yaet.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("")
public class HomeController {

    @RequestMapping("/")
    public ModelAndView toHome(ModelAndView modelAndView){
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
