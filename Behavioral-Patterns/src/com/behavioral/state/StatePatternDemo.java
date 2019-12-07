package com.behavioral.state;

import com.behavioral.state.Entity.Context;
import com.behavioral.state.Entity.StartState;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 12:18
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StartState());
        context.close();
        context.start();
    }

}
