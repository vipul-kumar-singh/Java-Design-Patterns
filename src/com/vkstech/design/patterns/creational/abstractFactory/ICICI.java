package com.vkstech.design.patterns.creational.abstractFactory;

public class ICICI implements Bank {

    private final String bankName;

    public ICICI() {
        bankName = "ICICI BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}