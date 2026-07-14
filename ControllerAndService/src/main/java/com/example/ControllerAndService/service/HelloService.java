package com.example.ControllerAndService.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {


    public String show(){
        return "Inside show method...";
    }
}
