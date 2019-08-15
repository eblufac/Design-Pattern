package com.creational.absfactory;

import com.creational.absfactory.Factory.AbstractFactory;
import com.creational.absfactory.Factory.FactoryProducer;
import com.creational.absfactory.Interface.Color;
import com.creational.absfactory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description demo
 * @date 2019/8/15 16:12
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        //获取所需的工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        //利用某一类工厂生产特点产品
        Shape shape = shapeFactory.getShape("circle");
        Color color = colorFactory.getColor("blue");

        //使用
        shape.draw();
        color.fill();
    }
}
