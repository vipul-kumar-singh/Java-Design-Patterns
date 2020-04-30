package com.vkstech.design.patterns.creational.abstractFactory;

import java.util.Objects;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {

        if (Objects.isNull(bank))
            return null;

        switch (bank) {
            case "HDFC":
                return new HDFC();
            case "ICICI":
                return new ICICI();
            case "SBI":
                return new SBI();
            default:
                return null;
        }
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}