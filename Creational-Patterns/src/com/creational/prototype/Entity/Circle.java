package com.creational.prototype.Entity;

import com.creational.prototype.Abstract.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/15 19:47
 */
public class Circle extends Shape {

    public Circle() {
        this.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
