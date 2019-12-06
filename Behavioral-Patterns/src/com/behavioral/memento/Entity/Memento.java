package com.behavioral.memento.Entity;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/6 12:28
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
