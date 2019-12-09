package com.behavioral.template;

import com.behavioral.template.Abstract.Game;
import com.behavioral.template.Entity.Cricket;
import com.behavioral.template.Entity.Football;

/**
 * @author lgy
 * @version 1
 * @description
 * 一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，
 * 但调用将以抽象类中定义的方式进行。
 * 在抽象类实现，其他步骤在子类实现。
 * 有多个子类共有的方法，且逻辑相同。
 * 封装不变部分，扩展可变部分。
 * @date 2019/12/9 12:31
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
