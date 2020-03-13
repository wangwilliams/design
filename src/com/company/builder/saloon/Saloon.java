package com.company.builder.saloon;

public class Saloon {
    private String wall;
    private String TV;
    private String sofa;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show() {
        System.out.println(this.sofa + " " + this.TV + " " + this.wall);
    }
}
