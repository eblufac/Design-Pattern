package com.structural.bridge.Abstract;

import com.structural.bridge.Interface.DrawApi;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/16 9:51
 */
public abstract class Shape {

    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
