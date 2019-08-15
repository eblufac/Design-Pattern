package com.creational.absfactory.Entity;

import com.creational.absfactory.Interface.Color;

/**
 * @author lgy
 * @version 1
 * @description 红色实体类
 * @date 2019/8/15 16:02
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
