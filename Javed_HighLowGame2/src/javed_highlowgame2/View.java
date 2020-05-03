/*
Ahlam JAved
ITDEV-110
Assignment #8
 */
package javed_highlowgame2;

/**
 *
 * @author ahlamjaved
 */
public class View {
     public void Intro() {
        System.out.println("This is a game where the computer selects a number");
        System.out.println("Then you guess the number.");
        System.out.println("The computer then determines if you guessed correct or not.");
        System.out.println("If you are correct, you win $40");
        System.out.println("If you lose, you lose the amount you bet, every time you guess wrong."); 
        System.out.println("The game ends when you run out of money to bet."); 
        System.out.println("Ready to play?");
    }
    
    public void Directions() {
        System.out.println("Let's get started!");
        System.out.println("You will begin with $100");
        System.out.println("The computer is choosing a number.....");
        System.out.println("................");
        System.out.println("Ok! The computer has chosen a number. Now time to guess what that number is!");
    }
    
    public void End() {
        System.out.println("Thanks for playing!");
    }
    
}
