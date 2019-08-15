package com.creational.absfactory.Factory;

import com.creational.absfactory.Interface.Color;
import com.creational.absfactory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description 抽象工厂类，定义抽象方法生产一类产品
 * @date 2019/8/15 16:04
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shapeType);
}
