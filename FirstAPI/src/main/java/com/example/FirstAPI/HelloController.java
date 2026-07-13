package com.example.FirstAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "Hello Preethi!";
    }

    @GetMapping("/about")
    public String aboutUs(){
        return "Strangers";
    }



}
