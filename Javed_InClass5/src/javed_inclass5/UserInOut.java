/*
 Ahlam Javed
ITDEV-110
In Class #5
 */
package javed_inclass5;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class UserInOut {
    //Decalring all variables used but ensuring they remain private
    private double game1;
    private double game2;
    private double game3;
    private static final int TOTALGAMES=3;
    //This objecgt is created in order to read data that is inputted from user
    Scanner input = new Scanner(System.in);
    
    //Constructor
    UserInOut(){
        Directions();
        Instructions();
        
    }
    
    public void Directions() {
        System.out.println("This Application calculates the average score of a bowling game from 3 scores given from the user.");
        System.out.println("");
    }
    
    public void Instructions() {
        System.out.println("Enter the score for Game 1: ");
        game1= input.nextDouble();
        System.out.println("Enter the score for Game 2: ");
        game2= input.nextDouble();
        System.out.println("Enter the score for Game 3: ");
        game3= input.nextDouble();
    }
    
    public double getGame1() {
        return (game1);
}
    
    public double getGame2() {
        return (game2);
    }
    
    public double getGame3() {
        return (game3);
    }
    
    public void displayAverage(double totalScore, double average) {
        System.out.println("Game 1:\t"+game1);
        System.out.println("Game 2:\t"+game2);
        System.out.println("Game 3:\t"+game3);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Total Score:\t"+totalScore);
        System.out.println();
        System.out.println();
        System.out.println("Average Score:\t"+average);
    }
    
}
