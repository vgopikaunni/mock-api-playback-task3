package com.alex.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfigClass
{
    @Bean
    public MyFirstClass MyFirstBean()
    {
        return new MyFirstClass("bean-1");
    }

    @Bean
    public MyFirstClass MySecondBean()
    {
        return new MyFirstClass("bean-2");
    }

    @Bean
    public MyFirstClass MyThirdBean()
    {
        return new MyFirstClass("bean-3");
    }

}
