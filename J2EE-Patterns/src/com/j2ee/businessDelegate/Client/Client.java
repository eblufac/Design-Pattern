package com.j2ee.businessDelegate.Client;

import com.j2ee.businessDelegate.BussinessDelegate.BusinessDelegate;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/10 12:17
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }

}
