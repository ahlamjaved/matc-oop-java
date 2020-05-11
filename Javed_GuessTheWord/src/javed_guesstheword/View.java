/*
 Ahlam Javed
ITDEV-110
Hangman assignment #9
 */
package javed_guesstheword;

import java.util.Scanner;

/**
 *
 * @author JAVEDAS1
 */

public class View {
    
    Scanner input = new Scanner(System.in);
    
    public void Begin() {
       System.out.println("\t\t\t\tWelcome to Hangman!");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       
    }
    
    public void Intro() {
        System.out.println("This is a game of Hangman!\n\nThe computer will select a word at random.\n\nYou have 7 guess to figure out the word.\n\n");
    }
    
    public void Directions() {
        System.out.println("To begin, the computer will now select a word a random.\n\nThen you will guess what letters are in the word.\n\nYou have 7 guesses and can not guess the same letter twice.");
    }
    
    public void displayState(char[] state) {
        for (int index = 0; index < state.length; index++){
            System.out.print(state[index]+" ");
        }
        System.out.println("");
        System.out.println("");
    }
    
    public char getGuess() {
        System.out.print("Guess a letter: ");
        String word = input.nextLine().toLowerCase();
        if (word.length() < 1) {
            word = " ";
        }
        char guessLetter = word.charAt(0);
        return guessLetter;
    }
    
    public void displayCorrect() {
        System.out.println("You Guessed correct!");
    }
    
    public void displayIncorrect() {
        System.out.println("Sorry that is incorrect.");
    }
    
    public void displayIncorrectGuesses(char[] incorrectLetters) {
        System.out.print("Incorrect Letters: ");
        for (int index = 0; index < incorrectLetters.length; index++) {
            System.out.print(incorrectLetters[index]+" ");
        }
        System.out.println("");
    }
    
    public void displayNumberOfGuesses(int guesses) {
        System.out.println("You have "+(7-guesses)+" guesses remaining.");
    }
    
    public boolean exit(){
        System.out.println("(0)to exit");
        System.out.println("(1) to play again.");
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
