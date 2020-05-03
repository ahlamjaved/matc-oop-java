/*
 Ahlam Javed
ITDEV-110
Assignment #6
 */
package javed_insertfunapp;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class Admin {

    //Variables
    Scanner input = new Scanner(System.in);
    boolean exit = false;
    
    //This class will handle the intro and the shutdown
    public void Intro() {
        System.out.println("Hello! This is an app that will ask the user for words that will be inserted into a common poem to yield a funny result.\n");
        System.out.println("You will be instructed to insert specific types of words.\n");
        System.out.println("Once all words have been inputted, a poem will be generated with all the words that were given for a good laugh.\n");
        System.out.println("Let's begin!\n");
    }
    
    //game should remain open to allow the user to continue playing the game until the user selects to close/exit/quit the app.
    public void exitChoice() {
        // exit app or play again?
        System.out.println("Would you like to play again?");
        System.out.println("Enter [0] to exit.");
        System.out.println("Enter [1] to begin again.");
        int exitInt = input.nextInt();
        input.nextLine();
        if (exitInt == 0) {
            exit = true;
        }
        else {
            exit = false;
        }
    }
}
