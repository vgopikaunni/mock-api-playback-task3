package com.alex.example;
import java.lang.String;


public class MyFirstClass {

     private final String saver;

    public MyFirstClass(String vara)
    {
        saver = vara;
    }

    public String sayHello()
    {
        return "Hello from my class. Running "+ saver;
    }
}
