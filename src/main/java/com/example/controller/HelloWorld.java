package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/12/28.
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello world!";
    }

}
