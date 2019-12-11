package com.j2ee.compositeEntity.Client;

import com.j2ee.compositeEntity.Composite.CompositeEntity;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/11 11:58
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
