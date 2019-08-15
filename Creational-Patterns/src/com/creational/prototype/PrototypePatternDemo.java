package com.creational.prototype;

import com.creational.prototype.Abstract.Shape;
import com.creational.prototype.Cache.ShapeCache;

/**
 * @author lgy
 * @version 1
 * @description demo
 * @date 2019/8/15 20:00
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println(cloneShape.getType());
    }
}
