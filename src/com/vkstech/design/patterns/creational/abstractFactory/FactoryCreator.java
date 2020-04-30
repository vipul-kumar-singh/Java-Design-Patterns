package com.vkstech.design.patterns.creational.abstractFactory;

import java.util.Objects;

public class FactoryCreator {

    public static AbstractFactory getFactory(String choice) {

        if (Objects.isNull(choice))
            return null;

        switch (choice){
            case "Bank" :
                return new BankFactory();
            case "Loan" :
                return new LoanFactory();
            default:
                return null;
        }
    }
}