package com.creational.absfactory.Factory;

import com.creational.absfactory.Entity.Circle;
import com.creational.absfactory.Entity.Rectangle;
import com.creational.absfactory.Entity.Square;
import com.creational.absfactory.Interface.Color;
import com.creational.absfactory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description 形状工厂类，专门生产形状产品
 * @date 2019/8/15 16:06
 */
public class ShapeFactory extends AbstractFactory{

    //不做具体实现
    @Override
    public Color getColor(String color) {
        return null;
    }

    //专门生产形状
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
