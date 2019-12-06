package com.behavioral.memento;

import com.behavioral.memento.Entity.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/6 12:29
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}
