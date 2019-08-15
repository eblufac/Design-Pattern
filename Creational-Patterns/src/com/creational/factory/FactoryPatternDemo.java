package com.creational.factory;

import com.creational.factory.Factory.ShapeFactory;
import com.creational.factory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description demo
 * @date 2019/8/15 15:45
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        Shape shape2 = ShapeFactory.getShape("rectangle");
        Shape shape3 = ShapeFactory.getShape("square");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
