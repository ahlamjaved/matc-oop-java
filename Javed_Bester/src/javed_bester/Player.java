/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_bester;

import java.util.Random;


public class Player {
    
    //Variables
    int lastScore;
    int turnsTaken;
    char pass = 'p';
    
    //Contructor
    Player() {
        lastScore = 0;
        turnsTaken = 0;
    }
    
    public int roll() {
        //This method gives a random number 1-6 and storing 5 different random values in 5 different variables. Then the method will RETURN the SUM of the 5 variables
        
        Random random = new Random();
        
        int dice1, dice2, dice3, dice4, dice5;
        int min = 1;
        int max = 5;
        
        dice1 = random.nextInt(max)+min;
        dice2 = random.nextInt(max)+min;
        dice3 = random.nextInt(max)+min;
        dice4 = random.nextInt(max)+min;
        dice5 = random.nextInt(max)+min;
        
        System.out.println(dice1+" "+ dice2+" " + dice3+" " + dice4+" " + dice5);
        
        return dice1+dice2+dice3+dice4+dice5;
    } 
    
    public void takeTurn() {
        
       
        
        System.out.println("Would you like to roll the die or pass your turn?");
        System.out.println("Enter [p] to pass.");
        System.out.println("Enter any other key to roll.");
        
        if (pass == 'p') {
            return;
        }
        else {
            int val = roll();
            turnsTaken++;
            lastScore = val;
            System.out.println("Your score is:\t"+val);
        }
        
    }
}
