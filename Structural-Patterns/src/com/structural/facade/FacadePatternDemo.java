package com.structural.facade;

/**
 * @author lgy
 * @version 1
 * @description
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 * 它向现有的系统添加一个接口，来隐藏系统的复杂性。
 * 该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
 * 在客户端和复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好。
 * @date 2019/12/2 12:15
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
