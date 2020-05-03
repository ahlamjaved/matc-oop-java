/*
Ahlam Javed
ITDEV-110
Midterm Assignment
 */
package javed_midterm;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class Model {
    
    //field variables
    Scanner input = new Scanner(System.in);
    boolean exitGame = false;
   
    
    public void getScores() {
        
        //local variables
        double avgScore = 0;
        int count = 0;
        String additionString = ""; 
        
        System.out.println("Enter your scores one at a time, then enter any non-digit to calculate average of all scores.");
        while (true) {
            System.out.print("Enter your score: ");
            if (!input.hasNextDouble()) 
                break;
            double inputScore = input.nextDouble();
            count++;
            avgScore = ((count-1)*(avgScore)+inputScore)/count;
            System.out.println("The average Score for "+count+ " score(s) entered is: "+avgScore);
            
            //Extra credit: Show each score entered in the latest average
            if (count ==1) {
                additionString = inputScore + "";
            }
            else {
                additionString = additionString + " + "+ inputScore;
            }
            System.out.println(additionString);
            
        }
        input.nextLine();
    }
    
    
    public void exitChoice() {
        System.out.println("Would you like to calculate another set of scores? [y/n]");
        System.out.println("Enter [N] to exit.");
        System.out.println("Enter [Y] to calculate again.");
        input.nextLine();
        String exit = input.nextLine();
        if (exit.equalsIgnoreCase("N")) {
            setExit(true);
        }
        else {
            setExit(false);
        }
    }
    
    // Using setters for the exit choice method
    public void setExit(boolean exit) {
        exitGame = exit;
    }
    
    //getting the boolean value of the exit choice
    public boolean getExit() {
        return exitGame;
    }
    
}
