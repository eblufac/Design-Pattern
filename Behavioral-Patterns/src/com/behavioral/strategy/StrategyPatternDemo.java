package com.behavioral.strategy;


import com.behavioral.strategy.Entity.OperationAdd;
import com.behavioral.strategy.Entity.OperationMultipy;
import com.behavioral.strategy.Entity.OperationSubstract;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/8 12:08
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("3 + 1 = " + context.executeStrategy(3, 1));
        context = new Context(new OperationSubstract());
        System.out.println("3 - 1 = " + context.executeStrategy(3, 1));
        context = new Context(new OperationMultipy());
        System.out.println("3 * 1 = " + context.executeStrategy(3, 1));
    }

}
