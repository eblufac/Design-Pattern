package com.j2ee.businessDelegate.BusinessService;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/10 12:14
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
