package com.xhs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 陈款
 * @since 2022/9/3
 */
@RestController
@RequestMapping("/autodeliver")
public class AutoDeliverController {

    @Autowired
    public RestTemplate restTemplate;
    @GetMapping("/checkState/{userId}")
    public Integer findResumeOpenState(@PathVariable Long userId){
        Integer forObject = restTemplate.getForObject("http://localhost:8080/resume/openstate/" + userId, Integer.class);
        System.out.println("=========消费端调用=====入参{"+userId+"},结果为={"+forObject+"}");
        return forObject;
    }
}
