package com.littlehui.design.adapter;

import com.littlehui.design.adapter.source.Adaptee;
import com.littlehui.design.adapter.source.Adapter;
import com.littlehui.design.adapter.target.ConcreteTarget;
import com.littlehui.design.adapter.target.Target;

/**
 * Created by littlehui on 2017/11/9.
 */
public class Client {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        Target adaTarget = new Adapter(new Adaptee());
        target.doTargetThings("意外");
        adaTarget.doTargetThings("意外");
    }
}
