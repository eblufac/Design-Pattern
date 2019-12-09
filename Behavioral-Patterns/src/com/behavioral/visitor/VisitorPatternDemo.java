package com.behavioral.visitor;

import com.behavioral.visitor.Entity.Computer;
import com.behavioral.visitor.Interface.ComputerPart;

/**
 * @author lgy
 * @version 1
 * @description
 * 使用了一个访问者类，它改变了元素类的执行算法.元素的执行算法可以随着访问者改变而改变。
 * 素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，
 * 在被访问的类里面加一个对外提供接待访问者的接口
 * @date 2019/12/9 13:13
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
