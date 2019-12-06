package com.behavioral.mediator.Entity;

import java.util.Date;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/6 12:13
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
