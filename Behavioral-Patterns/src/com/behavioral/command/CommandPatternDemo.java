package com.behavioral.command;

import com.behavioral.command.Entity.BuyStock;
import com.behavioral.command.Entity.SellStock;
import com.behavioral.command.Entity.Stock;

/**
 * @author lgy
 * @version 1
 * @description
 * 请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * 将一个请求封装成一个对象
 * @date 2019/12/4 13:35
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
