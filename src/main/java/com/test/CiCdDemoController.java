package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdDemoController {
    @RequestMapping("/")
    public String index(){
        return "Greeting from CI/CD demo!";
    }
}
