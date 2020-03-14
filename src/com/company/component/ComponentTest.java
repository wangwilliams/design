package com.company.component;

import java.util.ArrayList;
import java.util.Random;

interface Component {
    public void add(Component c);

    public void remove(Component c);

    public Component getChild(int i);

    public void operation();
}

/**
 * 透明式组合模式 缺点，叶子节点也要实现树枝节点的东西，只能代码不写来解决
 */
public class ComponentTest {
    public static void main(String[] args) {
        Component composite1 = new Composite();
        Component composite2 = new Composite();
        Leaf l1 = new Leaf("l1");
        Leaf l2 = new Leaf("l2");
        composite1.add(l1);
        composite1.add(l2);
        composite1.add(composite2);
        Leaf l31 = new Leaf("l31");
        Leaf l32 = new Leaf("l32");
        composite2.add(l31);
        composite2.add(l32);
        composite1.operation();
    }
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println(name + " 我超级绿;");
    }
}

class Composite implements Component {
    ArrayList<Component> children = new ArrayList<>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        if (i < children.size()) {
            return children.get(i);
        }
        return null;
    }

    @Override
    public void operation() {
        System.out.println("composite start operation : ");
        for (Component component : children) {
            component.operation();
        }
    }
}
