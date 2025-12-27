package com.hello_world.api.controllers;

import com.hello_world.api.HelloWorldReponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// this is the annotation which means that we're ready to use spring mvc to handle web request
// @RestController =  @Controller + @ResponseBody
public class HelloWorldController {

    @GetMapping("/hello")
    public HelloWorldReponse hello(){
        return new HelloWorldReponse("Hello World!");
    }

    @PostMapping("/hello")
    public HelloWorldReponse helloPost(@RequestBody String name){
        return new HelloWorldReponse("Hello "+ name+"!");
    }

}
