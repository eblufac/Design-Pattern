package com.behavioral.memento.Entity;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/6 12:29
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
