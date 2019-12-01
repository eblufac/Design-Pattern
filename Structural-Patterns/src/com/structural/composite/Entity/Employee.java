package com.structural.composite.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description 组织中员工的层次结构
 * @date 2019/12/1 12:06
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    //下级、部属
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
