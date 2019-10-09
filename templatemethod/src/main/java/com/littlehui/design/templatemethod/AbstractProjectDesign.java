package com.littlehui.design.templatemethod;

/**
 * @Description TODO
 * @ClassName AbstractProjectDesign
 * @Author littlehui
 * @Date 2019/10/9 11:12
 * @Version 1.0
 **/
public abstract class AbstractProjectDesign {

    public final void tempateMethod() {
        //需求分析
        demandAnalysis();
        //架构设计
        architecturalDesign();
        //代码编写
        coding();
    }

    protected abstract void demandAnalysis();

    protected abstract void architecturalDesign();

    protected abstract void coding();

}
