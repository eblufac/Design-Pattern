package com.j2ee.businessDelegate.BussinessDelegate;

import com.j2ee.businessDelegate.BusinessService.BusinessService;
import com.j2ee.businessDelegate.LookUpService.BusinessLookUp;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/10 12:15
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
