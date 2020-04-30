package com.vkstech.design.patterns.creational.abstractFactory;

public class HDFC implements Bank {

    private final String bankName;

    public HDFC() {
        bankName = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}