/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_bester;

import java.util.Scanner;

public class View {
    
    Scanner input = new Scanner(System.in);
    
    public String playerName(){
        System.out.println("Please enter the players name: ");
        return(input.nextLine());
    }
    
    public String NextTurn(){
        System.out.println("Press enter to roll dice");
        return(input.nextLine());
    }
    
    public void display(String name, int score, int rollNumber){
        System.out.println();
        System.out.println(name+":\t........................................."+score);
        System.out.println();
        System.out.println();
    }
    
    public void displaytotalRolls(int score, int rollNumber){
        System.out.println();
        System.out.println("Your total number of rolls is "+ rollNumber+" .");
        System.out.println();
        System.out.println();
    }
    
    public void roundWinner(int count, String winner){
    System.out.println("The winner of round "+count+" is "+winner+".");
       // System.out.println("The winner of all rounds is"+overallWinner);
        //System.out.println("");
       // System.out.println("");
    }
     public void overallWinner(int lower, int higher, String winner){
        System.out.println("The overall winner is "+winner+".");
        System.out.println(higher+" to "+lower);
        System.out.println("");
        System.out.println("");
    }
    
    public boolean exit(){
        System.out.println("(0)to exit");
        System.out.println("(1) to roll again.");
        if (input.nextInt()==0){
            input.nextLine();
            return(true);
        }
        else {
            input.nextLine();
            return(false);
        }
            
    }
}
