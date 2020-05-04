/*
ITDEV-110
Ahlam Javed
Bester Game- Assignment #9
 */
package javed_bester;

public class Controller {
    
    private int games;
   

    Player computerPlayer;
    Player player;
    View view;
    
    Controller() {
        games = 1;//Constructor to initialize the game
        
        view = new View();
        computerPlayer = new Player("computer");
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
            view.display(computerPlayer.getName(), computerPlayer.lastScore, roundNumber);

            boolean doesPlayerWantToPass = view.ShouldPlayerPass();
            player.takeTurn(doesPlayerWantToPass);
            view.display(player.getName(), player.lastScore, roundNumber);
            calculateRoundWinner();
            calculateOverallWinner();
            roundNumber++;

        } while ((!view.exit()) && (roundNumber < 5));
        games++;
    }

}
