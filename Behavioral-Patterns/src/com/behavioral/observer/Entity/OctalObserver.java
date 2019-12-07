package com.behavioral.observer.Entity;

import com.behavioral.observer.Abstract.Observer;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 11:56
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }

}
