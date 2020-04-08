package com.littlehui.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @ClassName Client
 * @Author littlehui
 * @Date 2019/10/12 15:16
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {

        List<MenuItem> menuItemList = new ArrayList();
        menuItemList.add(new MenuItem("CODE_1", "第一个菜单"));
        menuItemList.add(new MenuItem("CODE_2", "第二个菜单"));
        menuItemList.add(new MenuItem("CODE_3", "第三个菜单"));

        MenuContainer menuContainer = new MenuContainer(menuItemList);
        Iterator iterator = menuContainer.createIterator();
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem)iterator.next();
            if ("CODE_2".equals(item.getCode())) {
                iterator.remove();
            } else {
                item.printMenu();
            }
        }
    }
}
