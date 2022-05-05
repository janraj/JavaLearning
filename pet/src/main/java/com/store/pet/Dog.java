package com.store.pet;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    public void speak() {
        System.out.println("Woof");
    }
}
