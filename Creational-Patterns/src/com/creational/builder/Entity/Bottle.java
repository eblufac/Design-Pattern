package com.creational.builder.Entity;

import com.creational.builder.Interface.Packing;

/**
 * @author lgy
 * @version 1
 * @description 瓶子类
 * @date 2019/8/15 18:05
 */
public class Bottle implements Packing {
    @Override
    public String packing() {
        return "Bottle";
    }
}
