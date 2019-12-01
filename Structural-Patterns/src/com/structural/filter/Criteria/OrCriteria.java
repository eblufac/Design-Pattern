package com.structural.filter.Criteria;

import com.structural.filter.Entity.Person;
import com.structural.filter.Interface.Criteria;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/1 11:45
 */
public class OrCriteria implements Criteria {

    Criteria criteria;
    Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> secondCriteriaItems = otherCriteria.meetCriteria(persons);
        for (Person p : secondCriteriaItems) {
            if (!firstCriteriaItems.contains(p)) {
                firstCriteriaItems.add(p);
            }
        }
        return firstCriteriaItems;
    }

}
