package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class WebAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebAppApplication.class, args);
    }

}
