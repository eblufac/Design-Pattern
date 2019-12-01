package com.structural.filter.Criteria;

import com.structural.filter.Entity.Person;
import com.structural.filter.Interface.Criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/1 11:40
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(p ->
            p.getGender().equalsIgnoreCase("FEMALE")
        ).collect(Collectors.toList());
    }

}
