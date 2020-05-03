/*
Ahlam Javed
ITDEV-110
Assignment #3
Tippr Application
 */
package javed_tipper;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author ahlamjaved
 */
public class TipperApp {
    //Declarations
    String name;
    Scanner input = new Scanner(System.in);
    double billTotal;
    final double TIP = 0.15;
    double subTotal;
    double tipAmount;
    
    TipperApp(){
     //This is where the constructor will be
        Introduction();
        Directions();
        UserInput();
        TipCalc();
        displayTip();
    }
       
    public void Introduction(){
        System.out.println("This Application will calculate how much tip to leave at a restaurant.");
    }
    
    public void Directions(){
        System.out.println("Please supply the name of the restaurant and the subtotal of the bill.");
    }
    
    public void UserInput(){
        System.out.print("Enter the name of the restaurant: ");
        name = input.nextLine();
        System.out.print("Enter the bill total: $");
        billTotal = input.nextDouble();  
    }
    
    public void TipCalc(){
        tipAmount = billTotal*TIP;
        subTotal = billTotal+tipAmount;
    }

    public void displayTip(){
        //Displays the name of the restaurant
        System.out.println("Restaurant name:\t"+ name);
        // Displays the current time and date
        System.out.print("The current time is: \t");
        System.out.print(java.time.LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))+"\t"); 
        System.out.println(java.time.LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        //Displays output of billTotal, tipAmount, and subTotal after tip
        System.out.println("Total before tip:\t$"+billTotal);
        System.out.println("The tip amount is:\t$"+tipAmount);
        System.out.println("The subtotal after tip is:\t$"+subTotal);
        
    }
    
    
}
