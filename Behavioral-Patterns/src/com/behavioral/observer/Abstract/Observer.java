package com.behavioral.observer.Abstract;

import com.behavioral.observer.Entity.Subject;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 11:53
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
