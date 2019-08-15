package com.creational.absfactory.Entity;

import com.creational.absfactory.Interface.Color;

/**
 * @author lgy
 * @version 1
 * @description 绿色类
 * @date 2019/8/15 16:02
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
