package com.behavioral.mediator.Entity;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/6 12:14
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
