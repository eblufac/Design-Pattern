package com.j2ee.serviceLocator;

import com.j2ee.serviceLocator.Interface.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/13 17:22
 */
public class Cache {

    private List<Service> services;

    public Cache(){
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }

}
