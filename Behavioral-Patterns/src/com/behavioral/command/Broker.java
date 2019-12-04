package com.behavioral.command;

import com.behavioral.command.Interface.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/4 13:35
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
