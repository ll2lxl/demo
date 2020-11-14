package com.example.springboot.autoconfig.web.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

    @RequestMapping
    @ResponseBody
    public String helloWorld(){
        return "Hello,World!";
    }
}
