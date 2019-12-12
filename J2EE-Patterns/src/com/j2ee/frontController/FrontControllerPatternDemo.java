package com.j2ee.frontController;

import com.j2ee.frontController.Controller.FrontController;

/**
 * @author lgy
 * @version 1
 * @description
 * 提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理
 * 处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。
 * 前端控制器（Front Controller） - 处理应用程序所有类型请求的单个处理程序，应用程序
 * 可以是基于 web 的应用程序，也可以是基于桌面的应用程序。
 * 调度器（Dispatcher） - 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。
 * 视图（View） - 视图是为请求而创建的对象。
 * @date 2019/12/12 12:15
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }

}
