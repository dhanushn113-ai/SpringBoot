package com.example.LooseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sketch implements Writer{

    public Sketch(){
        System.out.println("Inside Sketch constructor...");
    }
    public void write() {
        System.out.println("Writing using sketch...");
    }
}
