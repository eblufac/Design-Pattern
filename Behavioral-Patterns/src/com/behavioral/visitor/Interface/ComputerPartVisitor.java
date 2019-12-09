package com.behavioral.visitor.Interface;

import com.behavioral.visitor.Entity.Computer;
import com.behavioral.visitor.Entity.Keyboard;
import com.behavioral.visitor.Entity.Monitor;
import com.behavioral.visitor.Entity.Mouse;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/9 13:12
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
