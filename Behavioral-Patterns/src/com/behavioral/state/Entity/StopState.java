package com.behavioral.state.Entity;

import com.behavioral.state.Interface.State;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 12:17
 */
public class StopState implements State {

    @Override
    public void start(Context context) {
        context.setState(new StartState());
        System.out.println("start State");
    }

    @Override
    public void close(Context context) {
    }
}
