package com.littlehui.design.templatemethod;

/**
 * @Description TODO
 * @ClassName PaymentProjectDesign
 * @Author littlehui
 * @Date 2019/10/9 11:27
 * @Version 1.0
 **/
public class PaymentProjectDesign extends AbstractProjectDesign {


    @Override
    protected void demandAnalysis() {
        System.out.println("支付项目需求分析");
    }

    @Override
    protected void architecturalDesign() {
        System.out.println("支付项目的架构设计");
    }

    @Override
    protected void coding() {
        System.out.println("支付项目的编码");
    }
}
