package com.company.contribute.prototype;

import java.util.stream.Stream;

public class Citation implements Cloneable {
    private String name = null;
    private String info = null;
    private String college = null;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getCollege() {
        return college;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name+" "+this.info+" "+this.college;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return super.clone();
    }
}
