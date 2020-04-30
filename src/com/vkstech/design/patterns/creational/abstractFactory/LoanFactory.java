package com.vkstech.design.patterns.creational.abstractFactory;

import java.util.Objects;

public class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {

        if (Objects.isNull(loan))
            return null;

        switch (loan) {
            case "Home":
                return new HomeLoan();
            case "Business":
                return new BusinessLoan();
            case "Education":
                return new EducationLoan();
            default:
                return null;
        }
    }
}
