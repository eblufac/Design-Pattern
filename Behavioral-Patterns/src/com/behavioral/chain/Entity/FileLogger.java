package com.behavioral.chain.Entity;

import com.behavioral.chain.Abstract.AbstractLogger;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/4 13:15
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
