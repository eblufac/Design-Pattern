package com.creational.builder.Entity;

import com.creational.builder.Abstract.Burger;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/15 18:54
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
