package com.vkstech.design.patterns.creational.abstractFactory;

public class HomeLoan extends Loan {

    @Override
    public void setInterestRate(double rate) {
        this.rate = rate;
    }
}
