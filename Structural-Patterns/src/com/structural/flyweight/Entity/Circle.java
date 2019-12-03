package com.structural.flyweight.Entity;

import com.structural.flyweight.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/3 12:22
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circlr::Draw() [Color :" + color
            + ", x :" + x + ", y :" + y + ", radius :" + radius);
    }
}
