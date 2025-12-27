package com.hello_world.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// this is the annotation which means that we're ready to use spring mvc to handle web request
// @RestController =  @Controller + @ResponseBody
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

}
