package com.littlehui.design.flyweight;

/**
 * Created by littlehui on 2018/1/23.
 */
public class Tree {
    private int x;
    private int y;
    private int age;

    public Tree(int x, int y, int age) {
        this.x = x;
        this.y = y;
        this.age = age;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("坐标x:" + x + "坐标y:" + y + "年龄age:" + age);
    }
}
