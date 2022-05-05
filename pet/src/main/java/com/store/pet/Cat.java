package com.store.pet;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

    public void speak() {
        System.out.println("Meow");
    }
}
