package com.creational.singleton;

import com.creational.singleton.Object.SingleObject;

/**
 * @author lgy
 * @version 1
 * @description demo
 * @date 2019/8/15 17:51
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
