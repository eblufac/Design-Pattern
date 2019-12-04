package com.behavioral.command.Entity;

import com.behavioral.command.Interface.Order;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/4 13:33
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
