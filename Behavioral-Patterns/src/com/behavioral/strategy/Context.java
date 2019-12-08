package com.behavioral.strategy;

import com.behavioral.strategy.Interface.Strategy;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/8 12:08
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
