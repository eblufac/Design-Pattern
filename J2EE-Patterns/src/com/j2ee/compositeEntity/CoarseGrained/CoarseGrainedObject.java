package com.j2ee.compositeEntity.CoarseGrained;

import com.j2ee.compositeEntity.Dependent.DependentObject1;
import com.j2ee.compositeEntity.Dependent.DependentObject2;

/**
 * @author lgy
 * @version 1
 * @description
 * coarse(粗糙的)、grain(谷粒、细粒)--->粗粒度
 * @date 2019/12/11 11:55
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}
