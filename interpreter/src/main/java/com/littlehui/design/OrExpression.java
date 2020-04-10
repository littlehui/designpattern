package com.littlehui.design;

/**
 * @Description TODO
 * @ClassName OrExpress
 * @Author littlehui
 * @Date 2020/4/10 10:25
 * @Version 1.0
 **/
public class OrExpress {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
