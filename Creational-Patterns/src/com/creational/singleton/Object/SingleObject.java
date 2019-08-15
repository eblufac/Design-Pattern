package com.creational.singleton.Object;

/**
 * @author lgy
 * @version 1
 * @description 单例类
 * @date 2019/8/15 16:24
 */
public class SingleObject {

    //构造方法私有
    private SingleObject() {}


    /**
     * 懒汉式，线程不安全
     */
//    private static SingleObject instance;
//    public static SingleObject getInstance() {
//        if (instance == null) {
//            instance = new SingleObject();
//        }
//        return instance;
//    }

    /**
     * 懒汉式，通过内置锁实现线程安全
     */
//    private static SingleObject instance;
//    public static synchronized SingleObject getInstance() {
//        if (instance == null) {
//            instance = new SingleObject();
//        }
//        return instance;
//    }

    /**
     * 饿汉式，线程安全
     */
    private static SingleObject instance = new SingleObject();
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
    /**
     * 双检锁 volatile保证可见性和有序性，synchronized防止多线程访问
     */
//    private volatile static SingleObject instance;
//    public static SingleObject getInstance() {
//        if (instance == null) {
//            synchronized (SingleObject.class) {
//                if (instance == null) {
//                    instance = new SingleObject();
//                }
//            }
//        }
//        return instance;
//    }

    /**
     * 登记式，静态内部类
     * 保证初始化时加载，和饿汉式很像，因此保证在一个线程中初始化
     * 静态内部类还是非静态内部类都是在被调用时才加载(非静态内部类不能具有静态模块)
     * 因此保证调用geyInstance方法时才实例化instance
     * 实现了懒加载
     */
//    private static class SingletonHolder {
//        private static final SingleObject INSTANCE = new SingleObject();
//    }
//    public static final SingleObject getInstance() {
//        return SingletonHolder.INSTANCE;
//    }

}

/**
 * 枚举利用类加载机制保证初始化安全
 * 且实现反序列化得到同一个对象
 */
enum Singleton {
    INSTANCE;
    private Singleton() {}

    //TODO 定义枚举方法
}