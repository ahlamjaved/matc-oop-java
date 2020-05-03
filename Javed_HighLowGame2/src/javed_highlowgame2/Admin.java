/*
Ahlam JAved
ITDEV-110
Assignment #8
 */
package javed_highlowgame2;

import java.util.Scanner;

import java.util.Random;


public class Admin {
    int enteredNumber;
    int randomNumber;
    int min = 1;
    int offset;
    boolean exit;
    char difficulty;
    double startingAmount = 100;
    double wageAmount;
    double prizeAmount = 40;
    double newAmount;
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    public void GameDifficulty() {
        System.out.println("What level would you like to play?");
        System.out.println("Press [A] for Easy");
        System.out.println("Press [B] for Medium");
        System.out.println("Press [C] for Hard");
        difficulty = input.next().charAt(0);
     
        if (difficulty == 'A') {
            offset = 20;
        }
        
        if (difficulty == 'B') {
            offset = 50;
        }
        
        if (difficulty == 'C') {
            offset = 100;
        }
        
        else {
            System.out.println("You did not select from the list, default difficulty chosen is [C] Hard.");
            offset = 100;
        }
    }
    
    public void ComputerGuess() {
        randomNumber = random.nextInt(offset)+min;
    }

    public void NumberFromUser() {
        System.out.println("Enter what number you think the computer chose: ");
        enteredNumber = input.nextInt();
    }
    
    public void CheckNumbers() {
        if (randomNumber == enteredNumber) {
            newAmount= startingAmount + prizeAmount;
            System.out.println("You Win!");
        }
        
        else if (randomNumber > enteredNumber) {
            System.out.println("Your guess was too low!");
            newAmount = startingAmount - wageAmount;
        }
        
        else {
            System.out.println("Your guess was too high!");
            newAmount = startingAmount - wageAmount;
        }
    }
    
    public boolean IsGuessCorrect() {
        if (enteredNumber == randomNumber) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean IsAmountEnough() {
        if (newAmount <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean exit() {
        System.out.println("Would you like to play again?");
        System.out.println("Press (0) to exit");
        System.out.println("Press (1) to guess again");
        if (input.nextInt()==0) {
            input.nextLine();
            return true;
        }
        else {
            input.nextLine();
            return false;
        }
    }
}
