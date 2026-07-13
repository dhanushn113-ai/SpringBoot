package com.example.LooseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer{
    public Pencil(){
        System.out.println("Inside pencil constructor...");
    }
    public void write() {
        System.out.println("Writing using pencil...");

    }
}
