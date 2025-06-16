package com.gopu.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return List.of(
            new Customer(101, "Raj", "raj@gmail.com"),
            new Customer(102, "Meera", "meera@xyz.com")
        );
    }

    @PostMapping("/orders")
public String placeOrder(@RequestBody Order order) {
    return "Order placed: " + order.getItem() + " (Qty: " + order.getQuantity() + ")";
}

}
