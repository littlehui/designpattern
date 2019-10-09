package com.littlehui.design.templatemethod;

/**
 * @Description TODO
 * @ClassName Client
 * @Author littlehui
 * @Date 2019/10/9 11:33
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        AbstractProjectDesign paymentProject = new PaymentProjectDesign();
        AbstractProjectDesign searchProject = new SearchProjectDesign();

        paymentProject.tempateMethod();
        searchProject.tempateMethod();
    }
}
