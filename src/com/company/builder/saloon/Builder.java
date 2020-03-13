package com.company.builder.saloon;

public abstract class Builder {
    protected Saloon saloon = new Saloon();

    public void buildWall() {
    }

    public void buildSofa() {
    }

    public void buildTV() {
    }

    public Saloon getResult() {
        return saloon;
    }
}
