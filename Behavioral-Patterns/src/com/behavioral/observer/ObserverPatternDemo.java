package com.behavioral.observer;

import com.behavioral.observer.Entity.BinaryObserver;
import com.behavioral.observer.Entity.HexaObserver;
import com.behavioral.observer.Entity.OctalObserver;
import com.behavioral.observer.Entity.Subject;

/**
 * @author lgy
 * @version 1
 * @description
 * 当一个对象被修改时，则会自动通知它的依赖对象。
 * 一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * 1、观察者和被观察者是抽象耦合的。 2、建立一套触发机制。
 * 触发链时适用，但应避免循环引用。
 * @date 2019/12/7 11:57
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
