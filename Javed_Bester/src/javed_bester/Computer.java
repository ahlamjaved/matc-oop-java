/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_bester;

/**
 *
 * @author ahlamjaved
 */
public class Computer {
    
    private int games;
   

    Player computerRoll = new Player("computer");
    Player playerRoll;// = new Dice("player");
    
    View view = new View();
    
    Computer() {
        games = 1;//Constructor to initialize the game
    }
    private void calculateRoundWinner() {

        if (computerRoll.getScore() > playerRoll.getScore()) {
            computerRoll.addWin();
            view.roundWinner(games, computerRoll.getPlayer());
        }

        if (computerRoll.getScore() < playerRoll.getScore()) {
            playerRoll.addWin();
            view.roundWinner(games, playerRoll.getPlayer());
        }
    }

    private void calculateOverallWinner() {
        if (computerRoll.getWins() > playerRoll.getWins()) {
            view.overallWinner(playerRoll.getWins(),computerRoll.getWins(), computerRoll.getPlayer());
        }
        if (computerRoll.getWins() < playerRoll.getWins()) {
            view.overallWinner(computerRoll.getWins(),playerRoll.getWins(), playerRoll.getPlayer());
        }
    }

    public void play() {
        playerRoll = new Player(view.playerName());
        do {
            view.display(computerRoll.getPlayer(), computerRoll.roll(), games);
            view.NextTurn();
            view.display(playerRoll.getPlayer(), playerRoll.roll(), games);
            calculateRoundWinner();
            calculateOverallWinner();
            
           
            games++;

        } while ((!view.exit()) && (games < 6));
        //ui.totalRolls(score, count);
    }

}
