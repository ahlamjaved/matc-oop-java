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
public class Game {
    
    private int games;
    
    Dice computerDice = new Dice ("Computer");
    Dice playerDice = new Dice ("Player");
    UserInterface ui = new UserInterface();
    
    Game() {
        //Crreate constructor to initialize integers
        games = 1;
    }
    
    private void calculateRoundWinner() {
        if (computerDice.getScore() > playerDice.getScore()) {
            computerDice.addWins();
            ui.roundWinner(games, computerDice.getPlayer());
        }
        
        if (playerDice.getScore() > computerDice.getScore()) {
            playerDice.addWins();
            ui.roundWinner(games, playerDice.getPlayer());
        }
    }
    
    private void calculateOverallWinner() {
        if (computerDice.getWins() > playerDice.getWins()) {
            ui.overallWinner(playerDice.getWins(), computerDice.getWins(), computerDice.getPlayer());
        }
        
        if (playerDice.getWins() > computerDice.getWins()) {
            ui.overallWinner(computerDice.getWins(), playerDice.getWins(), playerDice.getPlayer());
        }
    }
    
    public void play() {
        playerDice = new Dice(ui.playerName());
        do {
            ui.show(computerDice.getPlayer(), computerDice.rollDice(), games);
            ui.playersTurn();
            ui.show(playerDice.getPlayer(), playerDice.rollDice(), games);   
            calculateRoundWinner();
            calculateOverallWinner();
            games++;
                    
        } while (!ui.exit());
    }
}
