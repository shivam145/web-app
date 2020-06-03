package com.example.webapp.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnSpringBoot {


    public String getName() {
        return "This is a test";
    }
}
