package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    @ResponseBody
    public String greeting(){
        return "greeting";
    }
    @GetMapping("/hi")
    public String hi(@RequestParam(name="name",required = false,defaultValue = "World")String name, Model model){
        model.addAttribute("name",name);
        return "hi";
    }
}
