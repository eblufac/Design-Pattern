package com.structural.bridge.Entity;

import com.structural.bridge.Abstract.Shape;
import com.structural.bridge.Interface.DrawApi;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/16 9:53
 */
public class Circle extends Shape {


    private int x, y, radius;


    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * @description 依赖于接口，接口的具体实现类不同，则实现的功能也不同
     *              因此实体类功能独立于接口实现类
     *              抽象化与实现化间通过接口方法桥接，而内部结构是可独立变化的，实现抽象与实现的分离
     */
    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
