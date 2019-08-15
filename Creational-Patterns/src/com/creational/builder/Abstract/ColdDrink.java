package com.creational.builder.Abstract;

import com.creational.builder.Entity.Bottle;
import com.creational.builder.Interface.Item;
import com.creational.builder.Interface.Packing;

/**
 * @author lgy
 * @version 1
 * @description 冷饮抽象类
 * @date 2019/8/15 18:52
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
