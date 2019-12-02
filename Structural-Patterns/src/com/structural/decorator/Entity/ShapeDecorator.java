package com.structural.decorator.Entity;

import com.structural.decorator.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/2 11:49
 */
public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
