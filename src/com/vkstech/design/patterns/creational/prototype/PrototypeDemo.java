package com.vkstech.design.patterns.creational.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String eName = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String eDesignation = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eAddress = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double eSalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        EmployeeRecord e1 = new EmployeeRecord(eid, eName, eDesignation, eSalary, eAddress);
        e1.showRecord();

        System.out.println("\n");

        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
