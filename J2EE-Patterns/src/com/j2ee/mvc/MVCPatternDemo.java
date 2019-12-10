package com.j2ee.mvc;

import com.j2ee.mvc.Controller.StudentController;
import com.j2ee.mvc.Model.Student;
import com.j2ee.mvc.View.StudentView;

/**
 * @author lgy
 * @version 1
 * @description
 * 这种模式用于应用程序的分层开发
 * Model（模型） - 模型代表一个存取数据的对象或 JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器。
 * View（视图） - 视图代表模型包含的数据的可视化。
 * Controller（控制器） - 控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开。
 * @date 2019/12/10 12:05
 */
public class MVCPatternDemo {

    public static void main(String[] args) {
        //从数据库获取学生记录
        Student model  = retrieveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

}
