package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
public class AjaxController {
    @RequestMapping("/hello")
    public String say(){
        return "{'message':'sss'}";
    }
}
