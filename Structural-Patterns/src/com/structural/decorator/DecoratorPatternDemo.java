package com.structural.decorator;

import com.structural.decorator.DecoratorEntity.RedShapeDecorator;
import com.structural.decorator.Entity.Circle;
import com.structural.decorator.Entity.Rectangle;
import com.structural.decorator.Entity.ShapeDecorator;
import com.structural.decorator.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * 允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 * @date 2019/12/2 11:53
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }

}
