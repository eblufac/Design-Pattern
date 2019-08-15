package com.creational.builder.Entity;

import com.creational.builder.Abstract.ColdDrink;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/15 18:55
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
