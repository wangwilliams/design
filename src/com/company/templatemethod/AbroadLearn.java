package com.company.templatemethod;

/**
 * demo
 */
public class AbroadLearn {
    public static void main(String[] args) {
        StudyAbroad studyAbroad = new WangStudyAbroad();
        studyAbroad.TemplateMethod();
    }
}

abstract class StudyAbroad {
    public void TemplateMethod() {
        LookingForSchool();
        ApplyForEnrol();
        ApplyForPassport();
        ApplyForVisa();
        Arriving();
    }

    protected abstract void LookingForSchool();

    protected abstract void ApplyForEnrol();

    protected abstract void ApplyForPassport();

    protected abstract void ApplyForVisa();

    protected abstract void Arriving();
}

class WangStudyAbroad extends StudyAbroad {

    @Override
    protected void LookingForSchool() {
        System.out.println("Looking For School");
    }

    @Override
    protected void ApplyForEnrol() {
        System.out.println("Apply For Enrol");
    }

    @Override
    protected void ApplyForPassport() {
        System.out.println("Apply For Passport");
    }

    @Override
    protected void ApplyForVisa() {
        System.out.println("Apply For Visa");
    }

    @Override
    protected void Arriving() {
        System.out.println("Arriving");
    }
}