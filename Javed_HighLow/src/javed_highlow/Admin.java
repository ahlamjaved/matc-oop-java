/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_highlow;

import java.util.Scanner;

import java.util.Random;
/**
 *
 * @author ahlamjaved
 */
public class Admin {
    
    int enteredNumber;
    int randomNumber;
    int min = 1;
    int offset = 100;
    boolean exit;
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    public void ComputerGuess() {
        randomNumber = random.nextInt(offset)+min;
    }

    public void NumberFromUser() {
        System.out.println("Enter what number you think the computer chose: ");
        enteredNumber = input.nextInt();
    }
    
    public void CheckNumbers() {
        if (randomNumber == enteredNumber) {
            System.out.println("You Win!");
        }
        
        else if (randomNumber > enteredNumber) {
            System.out.println("Your guess was too low!");
        }
        
        else {
            System.out.println("Your guess was too high!");
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
