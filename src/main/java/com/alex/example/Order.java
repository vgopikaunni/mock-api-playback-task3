package com.alex.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order
{
    @JsonProperty("id")
    private int orderId;
    @JsonProperty("name")
    private String orderName;
    @JsonProperty("quantity")
    private int orderQuantity;

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public int getOrderQuantity()
    {
        return orderQuantity;
    }

    public void setOrderId(int orderId) {
        System.out.println("Automatically Accessing the setter method");
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
}

