package com.behavioral.chain.Entity;

import com.behavioral.chain.Abstract.AbstractLogger;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/4 13:14
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
