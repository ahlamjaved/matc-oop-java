/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_bankcalcmvc;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */


public class View {
    
    Scanner input = new Scanner(System.in);
    
    public void introduction() {
        System.out.print("this application calculates and displays simple interest");
        System.out.println("erned from a savings account.");
    }
    
    public void directions() {
        System.out.println("Please supply the name of the account holder, principal balance,");
        System.out.println("rate of insterest, and age of account.");
    }
    
    public String getNameFromUser() {
        System.out.println("Enter account holder's name: ");
        return input.nextLine();
    }
    
    public double getPrincipleAmountFromUser() {
        System.out.println(" Enter principal amount: ");
        return input.nextDouble();
    }
    
    public int getRateFromUser() {
        System.out.println("Enter the rate of interest as a whole number: ");
        return input.nextInt();
    }
    
    public int getAgeInMonthsFromUser() {
        System.out.println("Enter age of account in months");
        return input.nextInt();
    }
    
    public void bankDisplay(String name, double principal, double interest, int month, double accruedAmount) {
        System.out.println("\n\n\nAccount Holder:\t\t"+name);
        System.out.println("Principal Amount:\t"+principal);
        System.out.println("Interest Paid:\t\t"+interest);
        System.out.println("Age of Account(months):\t"+month);
        System.out.println("Accrued Amount:\t\t"+accruedAmount);
        System.out.println("Total Balance:"+(principal+accruedAmount));
    }
    
}
