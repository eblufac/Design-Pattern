package com.j2ee.businessDelegate.LookUpService;

import com.j2ee.businessDelegate.BusinessService.BusinessService;
import com.j2ee.businessDelegate.BusinessService.EJBService;
import com.j2ee.businessDelegate.BusinessService.JMSService;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/10 12:15
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }

}
