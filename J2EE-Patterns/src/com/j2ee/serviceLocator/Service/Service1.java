package com.j2ee.serviceLocator.Service;

import com.j2ee.serviceLocator.Interface.Service;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/13 17:20
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
