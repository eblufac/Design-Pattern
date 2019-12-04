package com.behavioral.chain.Entity;

import com.behavioral.chain.Abstract.AbstractLogger;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/4 13:12
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
