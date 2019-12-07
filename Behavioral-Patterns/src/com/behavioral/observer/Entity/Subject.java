package com.behavioral.observer.Entity;

import com.behavioral.observer.Abstract.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 11:53
 */
public class Subject {
    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
