package com.behavioral.command.Entity;

import com.behavioral.command.Interface.Order;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/4 13:32
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
