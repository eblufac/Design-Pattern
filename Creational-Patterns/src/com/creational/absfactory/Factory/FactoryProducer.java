package com.creational.absfactory.Factory;

/**
 * @author lgy
 * @version 1
 * @description 生成具体工厂的创建类
 * @date 2019/8/15 16:10
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
