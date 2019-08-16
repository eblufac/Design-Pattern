package com.structural.bridge;

import com.structural.bridge.Abstract.Shape;
import com.structural.bridge.Entity.Circle;
import com.structural.bridge.Entity.GreenCircle;
import com.structural.bridge.Entity.RedCircle;

/**
 * @author lgy
 * @version 1
 * @description demo
 * @date 2019/8/16 10:01
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,20, 100, new RedCircle());
        Shape greenCircle = new Circle(10, 200, 230, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
