package com.dhanush.Dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Pen {


    public Pen(){
        System.out.println("Pen Constructor is calling.....");
    }
    public void write(){
        System.out.println("writing using pen....");
    }

}
