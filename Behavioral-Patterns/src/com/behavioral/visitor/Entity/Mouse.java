package com.behavioral.visitor.Entity;

import com.behavioral.visitor.Interface.ComputerPart;
import com.behavioral.visitor.Interface.ComputerPartVisitor;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/9 13:10
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
