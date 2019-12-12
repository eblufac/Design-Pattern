package com.j2ee.InterceptingFilter;

import com.j2ee.InterceptingFilter.Interface.Filter;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/12 12:25
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }

}
