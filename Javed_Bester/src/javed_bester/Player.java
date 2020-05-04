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
    private String player;
    private int wins = 0;
    private int score;
    
    //Contructor
    Player(String name) {
        lastScore = 0;
        turnsTaken = 0;
        player = name;
        
    }
    
    private int roll() {
        //This method gives a random number 1-6 and storing 5 different random values in 5 different variables. Then the method will RETURN the SUM of the 5 variables
        
        Random random = new Random();
        
        int dice1, dice2, dice3, dice4, dice5;
        int min = 1;
        int max = 6;
        
        dice1 = random.nextInt(max)+min;
        dice2 = random.nextInt(max)+min;
        dice3 = random.nextInt(max)+min;
        dice4 = random.nextInt(max)+min;
        dice5 = random.nextInt(max)+min;
        
        System.out.println(dice1+" "+ dice2+" " + dice3+" " + dice4+" " + dice5);
        
        return dice1+dice2+dice3+dice4+dice5;
    } 
    
    public void takeTurn(boolean shouldPass) {
        
        if (shouldPass) {
            return;
        }
        else {
            int val = roll();
            turnsTaken++;
            lastScore = val;
            System.out.println("Your score is:\t"+val);
        }
        
    }
    
    public int getScore() {
        return score;
    }

    public int getWins() {
        return wins;
    }

    public void addWin() {
       wins++;
    }

    public String getName() {
        return player;
    }
}
