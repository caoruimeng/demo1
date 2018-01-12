package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/1/12.
 */
@RestController
public class UserController {
    @RequestMapping("/add")
    public String addUser(){
        return "hello world!";
    }
}
