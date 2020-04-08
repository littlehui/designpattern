package com.littlehui.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @ClassName MenuContainerIterator
 * @Author littlehui
 * @Date 2019/10/12 14:58
 * @Version 1.0
 **/
public class MenuContainerIterator implements Iterator {

    private List<MenuItem> menuItemList = null;

    private int currentIndex = -1;

    private int lastIndex = 0;

    public MenuContainerIterator(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
        lastIndex = menuItemList.size() - 1;
    }

    @Override
    public boolean hasNext() {
        if (currentIndex < lastIndex) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        MenuItem currentItem = menuItemList.get(++currentIndex);
        return currentItem;
    }

    @Override
    public void remove() {
        menuItemList.remove(currentIndex);
        --currentIndex;
        lastIndex = menuItemList.size() - 1;
    }
}
