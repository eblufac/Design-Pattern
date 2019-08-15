package com.creational.factory.Entity;

import com.creational.factory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description 矩形类
 * @date 2019/8/15 15:36
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
