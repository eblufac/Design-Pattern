package com.j2ee.InterceptingFilter.Filter;

import com.j2ee.InterceptingFilter.Interface.Filter;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/12 12:23
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
