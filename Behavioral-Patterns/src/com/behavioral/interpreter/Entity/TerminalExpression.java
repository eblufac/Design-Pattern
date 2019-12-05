package com.behavioral.interpreter.Entity;

import com.behavioral.interpreter.Interface.Expression;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/5 11:45
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
