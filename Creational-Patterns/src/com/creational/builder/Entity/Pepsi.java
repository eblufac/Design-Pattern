package com.creational.builder.Entity;

import com.creational.builder.Abstract.ColdDrink;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/15 18:57
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
