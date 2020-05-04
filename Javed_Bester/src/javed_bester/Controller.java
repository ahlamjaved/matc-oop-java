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
public class Controller {
    
    private int games;
   

    Player computerPlayer = new Player("computer");
    Player player;// = new Dice("player");
    
    View view = new View();
    
    Controller() {
        games = 1;//Constructor to initialize the game
    }
    private void calculateRoundWinner() {

        if (computerPlayer.getScore() > player.getScore()) {
            computerPlayer.addWin();
            view.roundWinner(games, computerPlayer.getPlayer());
        }

        if (computerPlayer.getScore() < player.getScore()) {
            player.addWin();
            view.roundWinner(games, player.getPlayer());
        }
    }

    private void calculateOverallWinner() {
        if (computerPlayer.getWins() > player.getWins()) {
            view.overallWinner(player.getWins(),computerPlayer.getWins(), computerPlayer.getPlayer());
        }
        if (computerPlayer.getWins() < player.getWins()) {
            view.overallWinner(computerPlayer.getWins(),player.getWins(), player.getPlayer());
        }
    }

    public void play() {
        player = new Player(view.playerName());
        do {
            view.display(computerPlayer.getPlayer(), computerPlayer.roll(), games);
            view.NextTurn();
            view.display(player.getPlayer(), player.roll(), games);
            calculateRoundWinner();
            calculateOverallWinner();
           
            games++;

        } while ((!view.exit()) && (games < 6));
        //ui.totalRolls(score, count);
    }

}
