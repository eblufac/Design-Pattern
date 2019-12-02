package com.structural.decorator.DecoratorEntity;

import com.structural.decorator.Entity.ShapeDecorator;
import com.structural.decorator.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/2 11:51
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border Color: Red");
    }
}
