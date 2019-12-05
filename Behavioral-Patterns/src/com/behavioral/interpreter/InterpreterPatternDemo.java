package com.behavioral.interpreter;

import com.behavioral.interpreter.Entity.AndExpression;
import com.behavioral.interpreter.Entity.OrExpression;
import com.behavioral.interpreter.Entity.TerminalExpression;
import com.behavioral.interpreter.Interface.Expression;

/**
 * @author lgy
 * @version 1
 * @description
 * 提供了评估语言的语法或表达式的方式
 * 实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 * 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 * 对于一些固定文法构建一个解释句子的解释器。
 * @date 2019/12/5 11:48
 */
public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
