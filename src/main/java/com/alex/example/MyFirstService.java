package com.alex.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService
{
    private MyFirstClass myFirstClass ;
    private Environment env;

    @Autowired
    public void setMyFirstclass(@Qualifier("MyFirstBean") MyFirstClass myFirstClass)
    {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory()
    {
        return "The dependency is saying :"+ myFirstClass.sayHello();
    }

    public String JavaVersion()
    {
        return (env.getProperty("java.version"))+(env.getProperty("os.name"));
    }

    @Autowired
    public void setEnv(Environment env)
    {
        this.env = env;
    }
}
