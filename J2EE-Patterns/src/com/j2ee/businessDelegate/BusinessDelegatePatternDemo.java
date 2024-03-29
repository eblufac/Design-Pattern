package com.j2ee.businessDelegate;

import com.j2ee.businessDelegate.BussinessDelegate.BusinessDelegate;
import com.j2ee.businessDelegate.Client.Client;

/**
 * @author lgy
 * @version 1
 * @description
 * 用于对表示层和业务层解耦。
 * 它基本上是用来减少通信或对表示层代码中的业务层代码的远程查询功能。
 * 客户端（Client） - 表示层代码可以是 JSP、servlet 或 UI java 代码。
 * 业务代表（Business Delegate） - 一个为客户端实体提供的入口类，它提供了对业务服务方法的访问。
 * 查询服务（LookUp Service） - 查找服务对象负责获取相关的业务实现，并提供业务对象对业务代表对象的访问。
 * 业务服务（Business Service） - 业务服务接口。实现了该业务服务的实体类，提供了实际的业务实现逻辑.
 * @date 2019/12/10 12:17
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }

}
