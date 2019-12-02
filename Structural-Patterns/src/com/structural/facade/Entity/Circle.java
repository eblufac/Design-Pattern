package com.structural.facade.Entity;

import com.structural.facade.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/2 12:11
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
