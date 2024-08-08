package com.practice.redis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  CounterController {


    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String count(){

        Long increment = redisTemplate.opsForValue().increment("count-view");

        return String.format("有 【%d】 人访问了页面", increment);
    }
}
