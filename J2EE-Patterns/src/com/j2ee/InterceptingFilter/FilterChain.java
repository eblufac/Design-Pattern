package com.j2ee.InterceptingFilter;

import com.j2ee.InterceptingFilter.Interface.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/12 12:24
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }

}
