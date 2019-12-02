package com.structural.decorator.Entity;

import com.structural.decorator.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/2 11:48
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

}
