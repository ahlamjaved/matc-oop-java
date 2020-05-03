/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_dice;

/**
 *
 * @author ahlamjaved
 */
public class Javed_Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instantiating two objects from Admin and Game
        
        Admin admin = new Admin();
        Game diceGame = new Game();
        
        admin.Setup();
        admin.Intro();
        diceGame.play();
        admin.Goodbye();
             
    }
    
}
