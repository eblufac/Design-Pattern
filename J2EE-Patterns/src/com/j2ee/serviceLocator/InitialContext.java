package com.j2ee.serviceLocator;

import com.j2ee.serviceLocator.Service.Service1;
import com.j2ee.serviceLocator.Service.Service2;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/13 17:21
 */
public class InitialContext {

    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }

}
