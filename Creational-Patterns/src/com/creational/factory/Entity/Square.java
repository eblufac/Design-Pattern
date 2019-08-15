package com.creational.factory.Entity;

import com.creational.factory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description 正方形类
 * @date 2019/8/15 15:38
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
