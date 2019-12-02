package com.structural.facade;

import com.structural.facade.Entity.Circle;
import com.structural.facade.Entity.Rectangle;
import com.structural.facade.Entity.Square;
import com.structural.facade.Interface.Shape;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/2 12:12
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() { circle.draw(); }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
