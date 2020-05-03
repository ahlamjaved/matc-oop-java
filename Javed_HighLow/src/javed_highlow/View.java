/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_highlow;

/**
 *
 * @author ahlamjaved
 */
public class View {
    
    public void Intro() {
        System.out.println("This is a game where the computer selects a number between 1-100");
        System.out.println("Then you guess the number.");
        System.out.println("The computer then determines if you guessed correct or not.");
        System.out.println("Ready to play?");
    }
    
    public void Directions() {
        System.out.println("Let's get started!");
        System.out.println("The computer is choosing a number.....");
        System.out.println("................");
        System.out.println("Ok! The computer has chosen a number. Now time to guess what that number is (1-100) !");
    }
    
    public void End() {
        System.out.println("Thanks for playing!");
    }
    
}
