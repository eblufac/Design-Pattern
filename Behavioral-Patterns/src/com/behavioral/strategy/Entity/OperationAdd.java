package com.behavioral.strategy.Entity;

import com.behavioral.strategy.Interface.Strategy;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/8 12:06
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
