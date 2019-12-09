package com.behavioral.visitor.Interface;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/9 13:08
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
