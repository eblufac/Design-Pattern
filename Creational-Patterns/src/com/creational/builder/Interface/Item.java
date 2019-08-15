package com.creational.builder.Interface;

/**
 * @author lgy
 * @version 1
 * @description 食物接口
 * @date 2019/8/15 18:01
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
