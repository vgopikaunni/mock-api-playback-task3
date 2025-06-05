package com.alex.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args)
	{

		var ctx = SpringApplication.run(ExampleApplication.class, args);

		MyFirstService obj1 = ctx.getBean(MyFirstService.class);
		 System.out.println(obj1.tellStory());
		 System.out.println(obj1.JavaVersion());
	}



}
