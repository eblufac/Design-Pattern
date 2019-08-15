package com.creational.absfactory.Entity;

import com.creational.absfactory.Interface.Color;

/**
 * @author lgy
 * @version 1
 * @description 蓝色类
 * @date 2019/8/15 16:03
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
