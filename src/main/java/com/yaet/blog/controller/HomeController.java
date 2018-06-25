package com.yaet.blog.controller;

import com.yaet.blog.utils.RedisCacheUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private RedisCacheUtil redisCacheUtil;

    @RequestMapping("/")
    public ModelAndView toHome(ModelAndView modelAndView) {
        List<Object> articles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Map<String, String> article = new HashMap<>();
            article.put("content", "wode booke");
            articles.add(article);
        }

        if (!redisCacheUtil.hasKey("content")) {
            redisCacheUtil.set("content", articles);
            LOGGER.info(redisCacheUtil.get("content").toString());
        }

        modelAndView.addObject("articles", articles);
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
