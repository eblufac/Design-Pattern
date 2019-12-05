package com.behavioral.iterator;

import com.behavioral.iterator.Entity.NameRepository;
import com.behavioral.iterator.Interface.Iterator;

/**
 * @author lgy
 * @version 1
 * @description
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 把在元素之间游走的责任交给迭代器，而不是聚合对象。
 * 1、访问一个聚合对象的内容而无须暴露它的内部表示。
 * 2、需要为聚合对象提供多种遍历方式。
 * 3、为遍历不同的聚合结构提供一个统一的接口。
 * @date 2019/12/5 12:03
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        Iterator iterator = namesRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
