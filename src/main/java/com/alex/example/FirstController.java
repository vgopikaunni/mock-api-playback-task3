package com.alex.example;


import com.alex.example.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController
{
    @PostMapping("hello")
    public String sayHello(@RequestBody OrderRecord orderObj)

    {
        return "Hello from FirstController. \nOrderId: "+orderObj.orderId()+"\nOrderName: "+orderObj.orderName()+"\nOrderQuantity: "+orderObj.orderQuantity();
    }

    @GetMapping("goodbye")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayGoodbye()
    {
        return "Goodbye from FirstController";

    }

    @GetMapping("hello/{user-name}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String helloUserName(@PathVariable("user-name") String userName)
    {
        return "Hello "+userName;
    }

    @GetMapping("goodbye/{username}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String goodbyeUserName(@PathVariable("username")  String username)
    {
        return "Goodbye "+username;
    }

    @GetMapping("/whatup")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String whatup(@RequestParam("username") String userName)
    {
        return "WHAT IS UP  "+userName;
    }
}
