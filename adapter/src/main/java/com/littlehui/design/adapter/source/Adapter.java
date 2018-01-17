package com.littlehui.design.adapter.source;

import com.littlehui.design.adapter.target.Target;

/**
 * Created by littlehui on 2017/11/9.
 */
public class Adapter implements Target {

    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void doTargetThings(String value) {
        adaptee.doSourceThings(value);
    }
}
