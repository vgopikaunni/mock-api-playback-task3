package com.gopu.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {


	public static void main(String[] args)
	{

		var ctx = SpringApplication.run(ExampleApplication.class, args);

	}



}
