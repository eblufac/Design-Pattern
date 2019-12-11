package com.j2ee.dataAccess.DAO;

import com.j2ee.dataAccess.Model.Student;

import java.util.List;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/11 12:05
 */
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
