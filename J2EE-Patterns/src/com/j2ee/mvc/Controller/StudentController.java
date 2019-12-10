package com.j2ee.mvc.Controller;

import com.j2ee.mvc.Model.Student;
import com.j2ee.mvc.View.StudentView;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/10 12:03
 */
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }

}
