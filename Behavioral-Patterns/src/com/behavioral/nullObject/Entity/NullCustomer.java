package com.behavioral.nullObject.Entity;

import com.behavioral.nullObject.Abstract.AbstractCustomer;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/8 11:54
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
