/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_dice;

import java.util.Random;

/**
 *
 * @author ahlamjaved
 */
public class Dice {
    private int dMin = 1;
    private int dMax = 6; // will select up to 6 but doesnt include 7
    private int score;
    private int wins = 0;
    private String player; //sets who is the player thats playing the dice; either player or computer. passing in name and setting as user
    
    Dice (String name) {
        player = name;
    }
    
    Random random= new  Random();
    
    public int rollDice() {
        score = random.nextInt(dMax)+dMin;
        return(score);
    }
    
    public int getScore() {
    return score;
    }
    
    public int getWins() {
        return wins;
    }
    
    public void addWins() {
        wins++;
    }
    
    public String getPlayer() {
        return player;
    }
    
}
