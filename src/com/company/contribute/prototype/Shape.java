package com.company.contribute.prototype;

public interface Shape extends Cloneable {
    public Object clone() throws CloneNotSupportedException;

    public void countArea();
}
