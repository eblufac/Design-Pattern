package com.structural.filter;

import com.structural.filter.Criteria.*;
import com.structural.filter.Entity.Person;
import com.structural.filter.Interface.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description 使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来
 * @date 2019/12/1 11:51
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = generaList();

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println(singleMale.meetCriteria(persons));
        System.out.println(singleOrFemale.meetCriteria(persons));
    }


    public static List<Person> generaList() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));
        return persons;
    }
}
