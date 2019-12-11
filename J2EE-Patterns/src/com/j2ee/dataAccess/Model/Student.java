package com.j2ee.dataAccess.Model;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/11 12:05
 */
public class Student {

    private String name;
    private int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}
