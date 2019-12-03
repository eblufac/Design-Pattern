package com.structural.proxy;

import com.structural.proxy.Interface.Image;

/**
 * @author lgy
 * @version 1
 * @description
 * 一个类代表另一个类的功能,创建具有现有对象的对象，以便向外界提供功能接口。
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * 直接访问对象时带来的问题(要访问的对象在远程的机器上,直接访问会给使用者或者系统结构带来很多麻烦)
 * 可以在访问此对象时加上一个对此对象的访问层.在访问一个类时做一些控制
 * 和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
 * 和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。
 * @date 2019/12/3 13:14
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("../image1");
        image.display();
        System.out.println("");
        image.display();
    }
}
