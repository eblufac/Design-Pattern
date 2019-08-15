package com.creational.builder.Entity;

import com.creational.builder.Abstract.Burger;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/15 18:56
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
