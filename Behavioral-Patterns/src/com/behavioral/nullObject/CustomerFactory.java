package com.behavioral.nullObject;

import com.behavioral.nullObject.Abstract.AbstractCustomer;
import com.behavioral.nullObject.Entity.NullCustomer;
import com.behavioral.nullObject.Entity.RealCustomer;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/8 11:55
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
