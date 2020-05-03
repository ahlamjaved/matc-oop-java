/*
 Ahlam Javed
ITDEV-117
Into to Object Oriented Programming
Assignment #4
 */

package javed_vtipper;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class VTipApp {
    //Declarations
    String name;
    Scanner input = new Scanner(System.in);
    Double billTotal,billSubtotal, tipAmount, perPerson;
    int tipPercent;
    final double percent = 100;
    boolean noExit = true;
    int split;
    
    VTipApp() {
        //constructor in a do-while loop- not used since being called from the main class. Added here for practice.
        /*do{
            Intro();
            Directions();
            InputScreen();
            TipCalc();
            TotalBill();
            exitChoice();
        } while (noExit);*/
         
    }
   
    public void Intro() {
        // Intro to the App
        System.out.println("This Application calculates what the bill subtotal will be.");
    }
    
    public void Directions() {
        //What the app needs from the user in order to calculate values
        System.out.println("Please provide the name of the restaurant, bill total, and how much tip you'd like to leave.");
    }
    
    public void InputScreen() {
        // Asking user for the necessary inputs
        System.out.print("To begin, please provide the name of the restaurant: ");
        name = input.nextLine();
        System.out.print("Enter the bill total: $");
        billTotal = input.nextDouble(); 
    }
    
    public boolean IsTipCorrect(int tipPercent) { 
        //Check if tip percent is within scope
        if ((tipPercent <= 50) && (tipPercent > 0))
            return true;
        else 
            return false;
    }
    
    public void TipCalc() {
        // Checking if tip is valid and calculating values using a while loop
        System.out.print("Lastly, please enter how much tip you would like to leave between 1% and 50%: ");
        tipPercent= input.nextInt(); 
        while (IsTipCorrect(tipPercent) == false) {
            System.out.print("Sorry, Please enter a tip amount between 1% and 50%: ");
            tipPercent = input.nextInt();
        }
        System.out.print("How many ways would you like to split the bill?  ");
        split= input.nextInt();
        tipAmount= billTotal*(tipPercent/percent);
        billSubtotal= (billTotal+tipAmount);
        //Extra credit: split the bill betweem amount of people
        perPerson= ((billTotal+tipAmount)/split);
    }      
    
    public void TotalBill() {
        // Display all output
        // Displays the current time and date
        System.out.print("The current time is: \t\t\t");
        System.out.print(java.time.LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))+"\t"); 
        System.out.println(java.time.LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println("Restaurant name:\t\t\t"+name);
        System.out.println("The bill total before tip:\t\t$"+billTotal);
        System.out.println("The tip percentage given is:\t\t"+tipPercent+"%");
        System.out.println("The tip amount calculated is: \t\t$"+tipAmount);
        System.out.println("The bill is split in:\t\t\t"+split+"  way(s)");
        System.out.println("The final subtotal of the bill is:\t$"+billSubtotal);
        System.out.println("The cost per person is:\t\t\t$"+perPerson);
    }
    
    public void exitChoice() {
        // exiting app or continue to begin again
        System.out.println("Would you like to calculate another bill?");
        System.out.println("Enter [0] to exit.");
        System.out.println("Enter [1] to begin again.");
        int exit = input.nextInt();
        // you type "1\n"
        // exit will have "1", but "\n" remains in the cursor
        input.nextLine();
        if (exit == 0) {
            noExit = false;
        }
        else {
            noExit = true;
        }
    }
    
}

    

