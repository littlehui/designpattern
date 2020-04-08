package com.littlehui.design.iterator;

/**
 * @Description TODO
 * @ClassName MenuItem
 * @Author littlehui
 * @Date 2019/10/12 14:57
 * @Version 1.0
 **/
public class MenuItem {

    private String code;

    private String menuName;

    public MenuItem(String code, String menuName) {
        this.code = code;
        this.menuName = menuName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void printMenu() {
        System.out.println("编码：" + code + "名称：" + menuName);
    }
}
