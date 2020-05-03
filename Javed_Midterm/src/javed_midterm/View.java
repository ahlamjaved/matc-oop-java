/*
Ahlam Javed
ITDEV-110
Midterm Assignment
 */
package javed_midterm;

/**
 *
 * @author ahlamjaved
 */
public class View {
    
    //Displays an intro to user
    public void Intro() {
        System.out.println("Hello this is a program that will allow a user to calculate the average for as many sets of bowling scores as the user would like.");
        System.out.println("This is not for the scores while playing the game, but for the total game score after a game has been played.");
    }
    
    //displays directions to users
    public void Directions() {
        System.out.println("You will need to enter the total number of games you played followed by the scores for each game. ");
    }
    
    //Closing statement to the user
    public void Closing() {
        System.out.println("Thank you for playing!");
    }
    
}
