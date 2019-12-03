package com.structural.flyweight;

import com.structural.flyweight.Entity.Circle;
import com.structural.flyweight.Interface.Shape;

import java.util.HashMap;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/3 12:26
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Create Circle Of Color " + color);
        }
        return circle;
    }

}
