package com.behavioral.visitor.Entity;

import com.behavioral.visitor.Interface.ComputerPart;
import com.behavioral.visitor.Interface.ComputerPartVisitor;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/9 13:11
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
