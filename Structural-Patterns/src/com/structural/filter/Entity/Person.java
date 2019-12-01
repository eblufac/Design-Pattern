package com.structural.filter.Entity;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/1 11:30
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatis;

    public Person(String name, String gender, String maritalStatis) {
        this.name = name;
        this.gender = gender;
        this.maritalStatis = maritalStatis;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatis() {
        return maritalStatis;
    }

}
