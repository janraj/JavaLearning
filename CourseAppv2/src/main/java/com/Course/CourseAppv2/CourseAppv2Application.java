package com.Course.CourseAppv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CourseAppv2Application {

	public static void main(String[] args) {
		SpringApplication.run(CourseAppv2Application.class, args);
	}

}
