package com.example.LooseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer{

    public Pen() {
        System.out.println("Inside pen constructor...");
    }
    public void write() {
        System.out.println("Writing using pen...");
    }
}
