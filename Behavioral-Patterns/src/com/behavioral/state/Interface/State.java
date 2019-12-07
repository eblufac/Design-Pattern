package com.behavioral.state.Interface;

import com.behavioral.state.Entity.Context;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 12:15
 */
public interface State {

    void start(Context context);
    void close(Context context);
}
