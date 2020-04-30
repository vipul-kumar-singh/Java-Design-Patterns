package com.vkstech.design.patterns.creational.abstractFactory;
import java.io.*;

public class AbstractFactoryPatternExample {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of Bank from where you want to take loan amount (HDFC/SBI/ICICI) : ");
        String bankName = br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan you want to take (Home/Business/Education) : ");
        String loanName = br.readLine();


        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);


        System.out.print("\n");
        System.out.print("Enter the interest rate for " + b.getBankName() + ": ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");
        double loanAmount = Double.parseDouble(br.readLine());

        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("You are taking the loan from " + b.getBankName());


        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.setInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }
}













