package com.example.first_java_webapp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String ReturnHello(){
        return "Hello World, it's Daryn Tazhibay's page my id is 200103210";
    }
    @RequestMapping("/hello")
    public String Return(){
        return "Hello ";
    }
}
