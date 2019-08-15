package com.creational.builder;

import com.creational.builder.Entity.ChickenBurger;
import com.creational.builder.Entity.Meal;
import com.creational.builder.Entity.Pepsi;
import com.creational.builder.Entity.VegBurger;

/**
 * @author lgy
 * @version 1
 * @description 建造者类，与工厂模式相比，其更侧重于内部加载及装配顺序
 * @date 2019/8/15 19:02
 */
public class MealBuilder {

    //创建出Meal实例，并对内部进行装配
    public Meal prepareMeal () {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
