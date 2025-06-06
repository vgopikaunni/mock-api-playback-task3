package com.alex.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService
{
    @Value("${my.location}")
    private String customProperty ;
    private MyFirstClass myFirstClass ;
    private Environment env;
    @Value("${my.name}")
    private String myName;

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

    public String readProperty()
    {
        return env.getProperty("my.custom.property");
    }

    public String getMyName()
    {
        return myName;
    }

    public String getLocation()
    {
        return customProperty;
    }


}
