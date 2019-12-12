package com.j2ee.InterceptingFilter;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/12 12:26
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
