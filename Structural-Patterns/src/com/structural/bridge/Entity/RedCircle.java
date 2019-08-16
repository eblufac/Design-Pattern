package com.structural.bridge.Entity;

import com.structural.bridge.Interface.DrawApi;

/**
 * @author lgy
 * @version 1
 * @description 桥接接口实现类
 * @date 2019/8/16 9:49
 */
public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " + x + ", " + y + "]");
    }
}
