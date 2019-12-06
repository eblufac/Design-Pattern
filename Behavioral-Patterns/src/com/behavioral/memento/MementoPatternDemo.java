package com.behavioral.memento;

import com.behavioral.memento.Entity.Originator;

/**
 * @author lgy
 * @version 1
 * @description
 * 保存一个对象的某个状态，以便在适当的时候恢复对象。
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，
 * 能够恢复到他原先的状态
 * @date 2019/12/6 12:31
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }

}
