package com.company.builder.saloon;

public class ProjectManager {
    private Builder builder;

    public ProjectManager(Builder builder) {
        this.builder = builder;
    }

    public Saloon decorate() {
        builder.buildSofa();
        builder.buildTV();
        builder.buildWall();
        return builder.getResult();
    }
}
