package com.store.pet;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetApplication {

	public static void main(String[] args) {

		System.out.println("Pet Store Application ");
		ApplicationContext applicationContext = SpringApplication.run(PetApplication.class, args);
		AnimalSpeak anim =  applicationContext.getBean(AnimalSpeak.class);
		Animal animal = applicationContext.getBean(AnimalSpeak.class);

	}

}
