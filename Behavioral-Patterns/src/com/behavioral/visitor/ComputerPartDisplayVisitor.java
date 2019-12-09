package com.behavioral.visitor;

import com.behavioral.visitor.Entity.Computer;
import com.behavioral.visitor.Entity.Keyboard;
import com.behavioral.visitor.Entity.Monitor;
import com.behavioral.visitor.Entity.Mouse;
import com.behavioral.visitor.Interface.ComputerPartVisitor;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/9 13:13
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
