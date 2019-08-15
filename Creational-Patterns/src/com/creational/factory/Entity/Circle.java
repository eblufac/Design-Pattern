package com.creational.factory.Entity;

import com.creational.factory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description 圆形类
 * @date 2019/8/15 15:39
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
