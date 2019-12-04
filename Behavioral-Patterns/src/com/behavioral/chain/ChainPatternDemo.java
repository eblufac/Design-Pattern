package com.behavioral.chain;

import com.behavioral.chain.Abstract.AbstractLogger;
import com.behavioral.chain.Entity.ConsoleLogger;
import com.behavioral.chain.Entity.ErrorLogger;
import com.behavioral.chain.Entity.FileLogger;

/**
 * @author lgy
 * @version 1
 * @description
 * 责任链模式为请求创建了一个接收者对象的链
 * 给予请求的类型，对请求的发送者和接收者进行解耦
 * 通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，
 * 那么它会把相同的请求传给下一个接收者，依此类推。
 * @date 2019/12/4 13:16
 */
public class ChainPatternDemo {

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }


    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
