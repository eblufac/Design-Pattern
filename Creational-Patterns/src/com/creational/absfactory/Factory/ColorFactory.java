package com.creational.absfactory.Factory;

import com.creational.absfactory.Entity.Blue;
import com.creational.absfactory.Entity.Green;
import com.creational.absfactory.Entity.Red;
import com.creational.absfactory.Interface.Color;
import com.creational.absfactory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description 颜色工厂类，专门生产颜色产品
 * @date 2019/8/15 16:08
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
