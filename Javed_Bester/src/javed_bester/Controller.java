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
            view.roundWinner(games, computerPlayer.getName());
        }

        if (computerPlayer.getScore() < player.getScore()) {
            player.addWin();
            view.roundWinner(games, player.getName());
        }
    }

    private void calculateOverallWinner() {
        if (computerPlayer.getWins() > player.getWins()) {
            view.overallWinner(player.getWins(),computerPlayer.getWins(), computerPlayer.getName());
        }
        if (computerPlayer.getWins() < player.getWins()) {
            view.overallWinner(computerPlayer.getWins(),player.getWins(), player.getName());
        }
    }
    
    public boolean ShouldComputerPass() {
        if (computerPlayer.getScore() > player.getScore())
                return true;
        else {
        return false;
        }
    }

    public void play() {
        int roundNumber = 0;
        player = new Player(view.playerName());
        do {
            computerPlayer.takeTurn(ShouldComputerPass());
            view.display(computerPlayer.getName(), computerPlayer.lastScore, games);
            //view.NextTurn();
            boolean doesPlayerWantToPass = view.ShouldPlayerPass();
            player.takeTurn(view.ShouldPlayerPass());
            view.display(player.getName(), player.turnsTaken, games);
            calculateRoundWinner();
            calculateOverallWinner();
            games++;

        } while ((!view.exit()) && (roundNumber < 5));
        //ui.totalRolls(score, count);
    }

}
