package com.example.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("hello")
    public String test(){
        logger.info("hello logback info");
        return "hello spring boot";
    }
}
