package com.config.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class DemoController {

    @Value("${message: Hello from demo controller}")
    private String localMessage;

    @GetMapping
    public String PlayDemoMessage(){
        System.out.println(localMessage);
        return localMessage;
    }
}
