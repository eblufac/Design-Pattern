package com.j2ee.compositeEntity;

import com.j2ee.compositeEntity.Client.Client;

/**
 * @author lgy
 * @version 1
 * @description
 * 用在 EJB 持久化机制中,一个组合实体是一个 EJB 实体 bean，代表了对象的图解.
 * 当更新一个组合实体时，内部依赖对象 beans 会自动更新，因为它们是由 EJB 实体 bean 管理的。
 * 组合实体（Composite Entity） - 它是主要的实体 bean。它可以是粗粒的，或者可以包含一个粗粒度对象，用于持续生命周期。
 * 粗粒度对象（Coarse-Grained Object） - 该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。
 * 依赖对象（Dependent Object） - 依赖对象是一个持续生命周期依赖于粗粒度对象的对象。
 * 策略（Strategies） - 策略表示如何实现组合实体。
 * @date 2019/12/11 11:59
 */
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }

}
