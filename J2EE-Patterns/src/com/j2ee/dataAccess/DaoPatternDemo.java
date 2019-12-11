package com.j2ee.dataAccess;

import com.j2ee.dataAccess.DAO.StudentDao;
import com.j2ee.dataAccess.DAOC.StudentDaoImpl;
import com.j2ee.dataAccess.Model.Student;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/11 12:09
 */
public class DaoPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }


        //更新学生
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }

}
