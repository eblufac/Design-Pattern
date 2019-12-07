package com.behavioral.state.Entity;

import com.behavioral.state.Interface.State;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 12:16
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void start() {
        getState().start(this);
    }

    public void close() {
        getState().close(this);
    }
}
