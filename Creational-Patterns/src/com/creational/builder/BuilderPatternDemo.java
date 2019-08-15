package com.creational.builder;

import com.creational.builder.Entity.Meal;

/**
 * @author lgy
 * @version 1
 * @description demo
 * @date 2019/8/15 19:06
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareMeal();

        System.out.println(meal.getCost());
    }
}
