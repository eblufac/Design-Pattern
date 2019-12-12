package com.j2ee.frontController;

import com.j2ee.frontController.View.HomeView;
import com.j2ee.frontController.View.StudentView;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/12 12:11
 */
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }

}
