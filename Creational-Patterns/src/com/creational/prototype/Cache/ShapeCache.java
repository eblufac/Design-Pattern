package com.creational.prototype.Cache;

import com.creational.prototype.Abstract.Shape;
import com.creational.prototype.Entity.Circle;
import com.creational.prototype.Entity.Rectangle;
import com.creational.prototype.Entity.Square;

import java.util.Hashtable;

/**
 * @author lgy
 * @version 1
 * @description 缓存Shape对象，用于克隆
 * @date 2019/8/15 19:48
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape cacheShape = shapeMap.get(id);
        return (Shape)cacheShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
