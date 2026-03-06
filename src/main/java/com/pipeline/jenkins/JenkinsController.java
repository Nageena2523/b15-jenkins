package com.pipeline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {
    @GetMapping("welcome")
    public String welocome(){
        return "welcome to jenkins ";
    }
    //added comment for maven
    @GetMapping("hello")
    public String hello(){
        return "hello nageena...";
    }
}
