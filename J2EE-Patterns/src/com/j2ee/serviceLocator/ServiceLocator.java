package com.j2ee.serviceLocator;

import com.j2ee.serviceLocator.Interface.Service;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/13 17:23
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }

}
