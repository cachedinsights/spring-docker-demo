package com.stackfortech.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class NetworkController {

    @GetMapping("/connect")
    public String connect(@RequestParam int portNo){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:"+portNo+"/api/hello?name=sample",String.class);
        return result;
    }
}
