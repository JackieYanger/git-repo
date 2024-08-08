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

        String k1 = redisTemplate.opsForValue().get("k1");
        String k2 = redisTemplate.opsForValue().get("k2");
        String k3 = redisTemplate.opsForValue().get("k3");
        String k4 = redisTemplate.opsForValue().get("k4");
        String k5 = redisTemplate.opsForValue().get("k5");


        return String.format("有 [%d]人访问了页面, 同时取得键值为[%s]、[%s]、[%s]、[%s]、、[%s]", increment,k1, k2, k3, k4 ,k5);
    }
}
