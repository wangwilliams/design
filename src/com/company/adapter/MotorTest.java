package com.company.adapter;

interface Motor {
    public void drive();
}

public class MotorTest {
    public static void main(String[] args) {
        Motor em = new EleMotorAdapter();
        Motor om = new OpticalAdapter();
        em.drive();
        om.drive();
    }
}

class ElectricMotor {
    public void electricDrive() {
        System.out.println("电动机电力驱动");
    }
}

class OpticalMotor {
    public void OpticalDrive() {
        System.out.println("光能驱动电动机");
    }
}

class EleMotorAdapter implements Motor {
    ElectricMotor em = new ElectricMotor();

    @Override
    public void drive() {
        em.electricDrive();
    }
}

class OpticalAdapter implements Motor {
    OpticalMotor om = new OpticalMotor();

    @Override
    public void drive() {
        om.OpticalDrive();
    }
}