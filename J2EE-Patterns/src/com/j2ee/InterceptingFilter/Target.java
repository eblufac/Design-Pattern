package com.j2ee.InterceptingFilter;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/12 12:24
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
