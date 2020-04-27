package com.stackfortech.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "Hello "+name+" from docker";
    }

    @GetMapping("/greet")
    public String greetings(@RequestParam String name){
        return "Greetings "+name + "I hope this tutorial is going smooth !! If Yes Please do subscribe :).";
    }
    @GetMapping("/add")
    public int add(@RequestParam int num1, int num2){
        return num1+num2;
    }
}
