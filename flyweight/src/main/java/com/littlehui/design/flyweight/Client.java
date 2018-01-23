package com.littlehui.design.flyweight;

/**
 * Created by littlehui on 2018/1/23.
 */
public class Client {

    public static void main(String[] args) {
        TreeManager treeManager = new TreeManager();
        Tree tree1 = treeManager.createTree(1,2,3);
        Tree tree2 = treeManager.createTree(1,2,3);
        Tree tree3 = treeManager.createTree(1,2,4);

        System.out.println("实例个数：" + "tree1, tree2, tree3");
        System.out.println("真实实例个数：");
        treeManager.displayAllTrees();
    }
}
