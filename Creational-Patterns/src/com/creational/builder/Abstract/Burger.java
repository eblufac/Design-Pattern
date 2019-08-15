package com.creational.builder.Abstract;

import com.creational.builder.Entity.Wrapper;
import com.creational.builder.Interface.Item;
import com.creational.builder.Interface.Packing;

/**
 * @author lgy
 * @version 1
 * @description 汉堡抽象类
 * @date 2019/8/15 18:50
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
