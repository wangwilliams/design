package com.company.contribute.Singleton;

import javax.swing.*;

public class Bajie extends JPanel {
    private final static Bajie bajie = new Bajie();

    private Bajie(){

    }

    public static Bajie getInstance() {
        return bajie;
    }
}
