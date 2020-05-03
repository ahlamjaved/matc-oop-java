/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_bankcalc;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class BankBalance {
    // defining all the variables
    int rate, month;
    String name;
    double principal, interest, accruedAmount;
    final double PERCENT = 100;
    final double YEAR = 12;
    //listing this variable form a set of classes
    Scanner input = new Scanner(System.in);
    
    BankBalance(){
        // This is the constructor
        introduction();
        directions();
        userInput();
        interestCalc();
        bankDisplay();
    }
    
    public void introduction(){
        System.out.print("this application calculates and displays simple interest");
        System.out.println("erned from a savings account.");
    }
    
    public void directions(){
        System.out.println("Please supply the name of the account holder, principal balance,");
        System.out.println("rate of insterest, and age of account.");
    }
    
    public void userInput(){
        System.out.println("Enter account holder's name: ");
        name = input.nextLine();
        System.out.println(" Enter principal amount: ");
        principal = input.nextDouble();
        System.out.println("Enter the rate of interest as a whole number: ");
        rate = input.nextInt();
        System.out.println("Enter age of account in months");
        month = input.nextInt();
    }
    
    public void interestCalc(){
        double decimalRate = rate/PERCENT;
        double time = month/YEAR;
        interest = decimalRate*time;
        accruedAmount = principal*interest;
    }
    
    public void bankDisplay(){
        System.out.println("\n\n\nAccount Holder:\t\t"+name);
        System.out.println("Principal Amount:\t"+principal);
        System.out.println("Interest Paid:\t\t"+interest);
        System.out.println("Age of Account(months):\t"+month);
        System.out.println("Accrued Amount:\t\t"+accruedAmount);
        System.out.println("Total Balance:"+(principal+accruedAmount));
    }
    
    
}
