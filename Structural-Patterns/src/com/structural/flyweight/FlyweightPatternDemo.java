package com.structural.flyweight;

import com.structural.flyweight.Entity.Circle;


/**
 * @author lgy
 * @version 1
 * @description
 * 就是共享对象，在某些对象需要重复创建，且最终只需要得到单一结果的情况下使用。
 * 利用先前创建的已有对象，通过某种规则去判断当前所需对象是否可以利用原有对象做相应修改后得到想要的效果.
 * 例子便是JAVA中的字符串缓存池，每次使用时如果缓存池中有字符串就直接获取，或者创建并加入缓存池
 * @date 2019/12/3 12:30
 */
public class FlyweightPatternDemo {

    private static final String[] color =
        {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i ++) {
            Circle circle = (Circle)ShapeFactory
                .getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return color[(int)(Math.random()*color.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random() * 100);
    }

    private static int getRandomY() {
        return (int)(Math.random() * 100);
    }
}
