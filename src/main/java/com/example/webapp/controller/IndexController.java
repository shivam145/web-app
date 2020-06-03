package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    public IndexController() {
        System.out.println("Index Controller instantiated");
    }
    @RequestMapping("index")
    public String index() {
        System.out.println("Hello there");
        return "index";
    }
}
