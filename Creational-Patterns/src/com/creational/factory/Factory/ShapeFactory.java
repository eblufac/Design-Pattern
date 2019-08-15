package com.creational.factory.Factory;

import com.creational.factory.Entity.Circle;
import com.creational.factory.Entity.Rectangle;
import com.creational.factory.Entity.Square;
import com.creational.factory.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description 工厂类，用来生产形状对象
 * @date 2019/8/15 15:39
 */
public class ShapeFactory {

    /**
     * @description 生产方法
     * @param shapeType 根据传入的参数产生相应的对象，因此创建实例由工厂类完成
     * @return 返回创建的对象
     */
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        //equalsIgnoreCase 忽略大小写
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
