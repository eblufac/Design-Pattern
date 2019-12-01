package com.structural.filter.Interface;
import com.structural.filter.Entity.Person;

import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description criteria(标准、准则)
 * @date 2019/12/1 11:34
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
