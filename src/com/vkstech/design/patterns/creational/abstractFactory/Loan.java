package com.vkstech.design.patterns.creational.abstractFactory;

public abstract class Loan {

    protected double rate;

    abstract void setInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {

        double EMI;
        int n;

        n = years * 12;
        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;

        System.out.println("your's monthly EMI is " + EMI + " for the amount " + loanAmount + " you have borrowed ");
    }
}