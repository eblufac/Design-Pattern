package com.behavioral.observer.Entity;

import com.behavioral.observer.Abstract.Observer;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/7 11:57
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

}
