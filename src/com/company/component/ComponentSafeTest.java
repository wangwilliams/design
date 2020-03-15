package com.company.component;

import java.util.ArrayList;

interface ComponentSafe {
    public void operation();
}

/**
 * 安全性组合模式，一般更常用，但是将节点和叶子分开，类似以view 和 viewGroup
 * 以及thread 和 ThreadGroup
 */
public class ComponentSafeTest {
    public static void main(String[] args) {
        ComponentSafe leaf1 = new LeafSafe("枫树叶");
        LeafSafe leaf2 = new LeafSafe("杨树叶");
        LeafSafe leaf3 = new LeafSafe("柳树叶");
        CompositeSafe root = new CompositeSafe();
        CompositeSafe first = new CompositeSafe();
        root.add(leaf1);
        first.add(leaf2);
        first.add(leaf3);
        root.add(first);
        root.operation();
    }
}

class LeafSafe implements ComponentSafe {
    private String name;

    public LeafSafe(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶：" + name + ": 被访问！");
    }
}

class CompositeSafe implements ComponentSafe {
    ArrayList<ComponentSafe> children = new ArrayList<>();

    public void add(ComponentSafe c) {
        children.add(c);
    }

    public ComponentSafe getChild(int i) {
        if (i < children.size()) {
            return children.get(i);
        }
        return null;
    }

    public void remove(ComponentSafe c) {
        children.remove(c);
    }

    @Override
    public void operation() {
        for (ComponentSafe obj : children) {
            obj.operation();
        }
    }
}