package com.behavioral.mediator;

import com.behavioral.mediator.Entity.User;

/**
 * @author lgy
 * @version 1
 * @description
 * 用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，
 * 并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，
 * 而且可以独立地改变它们之间的交互。
 * 对象 Colleague 之间的通信封装到一个类中单独处理。
 * @date 2019/12/6 12:16
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
