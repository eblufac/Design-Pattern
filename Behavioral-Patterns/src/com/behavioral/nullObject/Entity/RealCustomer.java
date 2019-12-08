package com.behavioral.nullObject.Entity;

import com.behavioral.nullObject.Abstract.AbstractCustomer;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/8 11:52
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
