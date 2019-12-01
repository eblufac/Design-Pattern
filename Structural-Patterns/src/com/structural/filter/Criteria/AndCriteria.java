package com.structural.filter.Criteria;

import com.structural.filter.Entity.Person;
import com.structural.filter.Interface.Criteria;

import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/1 11:43
 */
public class AndCriteria implements Criteria {

    Criteria criteria;
    Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return otherCriteria.meetCriteria(criteria
            .meetCriteria(persons));
    }
}
