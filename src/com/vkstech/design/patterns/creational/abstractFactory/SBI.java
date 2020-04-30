package com.vkstech.design.patterns.creational.abstractFactory;

public class SBI implements Bank {

    private final String bankName;

    public SBI() {
        bankName = "SBI BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
