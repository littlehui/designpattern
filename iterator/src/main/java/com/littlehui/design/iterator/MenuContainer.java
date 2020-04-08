package com.littlehui.design.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @ClassName MenuContainer
 * @Author littlehui
 * @Date 2019/10/12 14:57
 * @Version 1.0
 **/
public class MenuContainer implements IteratorCreator {

    private List<MenuItem> menuItems;

    public MenuContainer(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuContainer() {

    }

    public void addMenuItem(MenuItem menuItem) {
        if (menuItems == null) {
            menuItems = new ArrayList<MenuItem>();
        }
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new MenuContainerIterator(menuItems);
    }

}
