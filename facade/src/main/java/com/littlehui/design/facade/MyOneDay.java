package com.littlehui.design.facade;

/**
 * Created by littlehui on 2018/1/16.
 * 我的一天
 */
public class MyOneDay {

    private Morning morning;

    private Road road;

    private Back back;

    private Office office;

    private Rest rest;

    public MyOneDay(Morning morning, Office office, Back back, Road road, Rest rest) {
        this.morning = morning;
        this.office = office;
        this.back = back;
        this.road = road;
        this.rest = rest;
    }

    /**
     * 在家起床
     */
    public void morning() {
        morning.morningStepA();
        morning.morningStepB();
        morning.moringStepC();
    }

    /**
     * 去公司
     */
    public void goToOffice() {
        road.onLoadA();
        road.onLoadB();
        road.onLoadC();
        road.onLoadE();
    }

    /**
     * 工作，coding
     */
    public void work() {
        office.officeA();
        office.officeB();
        office.officeC();
    }

    public void backToHome() {
        back.backStepA();
        back.backStepB();
        back.backStepC();
        back.backStepD();
    }

    public void rest() {
        rest.restA();
        rest.restB();
        rest.restC();
        rest.restD();
    }

    public void myWholeDay() {
        morning();
        goToOffice();
        work();
        backToHome();
        rest();
    }
}
