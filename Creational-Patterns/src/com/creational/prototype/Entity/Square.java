package com.creational.prototype.Entity;

import com.creational.prototype.Abstract.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/15 19:46
 */
public class Square extends Shape {

    public Square() {
        this.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
