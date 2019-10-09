package com.littlehui.design.templatemethod;

/**
 * @Description TODO
 * @ClassName SearchProjectDesign
 * @Author littlehui
 * @Date 2019/10/9 11:32
 * @Version 1.0
 **/
public class SearchProjectDesign extends AbstractProjectDesign {

    @Override
    protected void demandAnalysis() {
        System.out.println("搜索项目需求分析");
    }

    @Override
    protected void architecturalDesign() {
        System.out.println("搜索项目架构设计");
    }

    @Override
    protected void coding() {
        System.out.println("搜索项目编码");
    }
}
