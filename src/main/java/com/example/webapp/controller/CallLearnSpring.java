package com.example.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallLearnSpring {

    @Autowired
    private LearnSpringBoot LSB ;

    @RequestMapping("/Name")
    private String displayName() {
        return LSB.getName();
    }
}
