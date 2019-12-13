package com.j2ee.transferObject;

import com.j2ee.transferObject.Entity.StudentBO;
import com.j2ee.transferObject.Entity.StudentVO;

/**
 * @author lgy
 * @version 1
 * @description
 * 用于从客户端向服务器一次性传递带有多个属性的数据
 * 传输对象是一个具有 getter/setter 方法的简单的 POJO 类，它是可序列化的，所以它可以通过网络传输
 * 没有任何的行为。服务器端的业务类通常从数据库读取数据，然后填充 POJO，并把它发送到客户端或按值传
 * 递它。对于客户端，传输对象是只读的。客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性
 * 更新数据库中的数值
 * 业务对象（Business Object） - 为传输对象填充数据的业务服务。
 * 传输对象（Transfer Object） - 简单的 POJO，只有设置/获取属性的方法。
 * 客户端（Client） - 客户端可以发送请求或者发送传输对象到业务对象。
 * @date 2019/12/13 17:30
 */
public class TransferObjectPatternDemo {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        //更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }

}
