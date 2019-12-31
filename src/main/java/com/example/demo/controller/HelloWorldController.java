package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/h")
public class HelloWorldController {
    @Value("${helloWorld}")
    private String hello;

    @Value("${mysql.jdbcName}")
    private String jdbcName;

    @Value("${mysql.dbUrl}")
    private String dbUrl;

    @RequestMapping("/hello")
    public String hello(){
        return hello+"<br>"+jdbcName+"</br>"+dbUrl;
    }




}
