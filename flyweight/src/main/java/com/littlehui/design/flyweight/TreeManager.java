package com.littlehui.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by littlehui on 2018/1/23.
 */
public class TreeManager {

    Map<String, Tree> allTrees = new HashMap<String, Tree>();

    public Tree createTree(int x, int y, int age) {
        String treeHash = new StringBuffer().append(x).append(y).append(age).toString();
        if (allTrees.get(treeHash) != null) {
            return allTrees.get(treeHash);
        } else {
            Tree tree = new Tree(x, y, age);
            allTrees.put(treeHash, tree);
            return allTrees.get(treeHash);
        }
    }

    public void displayAllTrees() {
        for (String key : allTrees.keySet()) {
            Tree tree = allTrees.get(key);
            tree.display();
        }
    }
}
