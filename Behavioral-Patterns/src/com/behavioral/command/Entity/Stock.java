package com.behavioral.command.Entity;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/4 13:30
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+ name
            + ", Quantity: " + quantity + " ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: " + name
            + ", Quantity: " + quantity + " ] sold");
    }
}
