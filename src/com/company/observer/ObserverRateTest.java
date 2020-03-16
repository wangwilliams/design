package com.company.observer;

import java.util.ArrayList;

interface Company {
    public void response(double number);
}

/**
 * 通过改变汇率影响不同公司
 */
public class ObserverRateTest {
    public static void main(String[] args) {
        Rate rate = new Rate();
        Company companyA = new CompanyA(rate);
        Company companyB = new CompanyB(rate);
        rate.notifyAllCompanies(5d);
        System.out.println("=================================");
        rate.notifyAllCompanies(7.5d);
    }
}

class Rate {
    ArrayList<Company> companies = new ArrayList<>();

    public void addCompany(Company company) {
        companies.add(company);
    }

    public void removeCompany(Company company) {
        companies.remove(company);
    }

    public void notifyAllCompanies(double number) {
        for (Company company : companies) {
            company.response(number);
        }
    }
}

class CompanyA implements Company {
    private Rate rate = null;

    public CompanyA(Rate rate) {
        this.rate = rate;
        rate.addCompany(this);
    }

    @Override
    public void response(double number) {
        if (number > 7) {
            System.out.println("Good news for A, I will be rich!");
        } else {
            System.out.println("Bad news for A, I won't want this.");
        }
    }
}

class CompanyB implements Company {
    private Rate rate = null;

    public CompanyB(Rate rate) {
        this.rate = rate;
        rate.addCompany(this);
    }

    @Override
    public void response(double number) {
        if (number < 7) {
            System.out.println("Good news for B, I will be rich!");
        } else {
            System.out.println("Bad news for B, I won't want this.");
        }
    }
}