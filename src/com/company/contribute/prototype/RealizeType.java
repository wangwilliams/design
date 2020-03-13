package com.company.contribute.prototype;

public class RealizeType implements Prototype {
    public RealizeType() {
        System.out.println("具体原型类创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型类复制成功");
        return (RealizeType) super.clone();
    }
}
