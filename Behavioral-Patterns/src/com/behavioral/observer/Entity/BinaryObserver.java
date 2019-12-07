package com.behavioral.observer.Entity;

import com.behavioral.observer.Abstract.Observer;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 11:54
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
