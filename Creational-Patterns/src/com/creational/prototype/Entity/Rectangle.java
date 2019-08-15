package com.creational.prototype.Entity;

import com.creational.prototype.Abstract.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/15 19:40
 */
public class Rectangle extends Shape {

    public Rectangle() {
        this.type = "Rectangle";
    }

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
