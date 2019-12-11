package com.j2ee.compositeEntity.Composite;

import com.j2ee.compositeEntity.CoarseGrained.CoarseGrainedObject;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/11 11:58
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
