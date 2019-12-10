package com.j2ee.mvc.View;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/10 12:02
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
