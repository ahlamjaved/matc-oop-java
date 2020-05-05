/*
ITDEV-110
Ahlam Javed
Bester Game- Assignment #9
 */
package javed_bester;

public class Controller {
    
    //private int games;
   

    Player computerPlayer;
    Player player;
    View view;
    
    Controller() {
        //games = 1;//Constructor to initialize the game
        
        view = new View();
        computerPlayer = new Player("Computer");
    }
    private void calculateWinner() {

        if (computerPlayer.getLastScore() > player.getLastScore()) {
            computerPlayer.addWin();
            view.displayWinner("Computer", computerPlayer.getLastScore());
            //view.roundWinner(games, computerPlayer.getName());
        }

        if (computerPlayer.getLastScore() < player.getLastScore()) {
            player.addWin();
            view.displayWinner(player.getName(), player.getLastScore());
        }
    }

    
    public boolean ShouldComputerPass() {
        if (computerPlayer.getLastScore() > player.getLastScore())
                return true;
        else {
        return false;
        }
    }

    public void play() {
        int roundNumber = 0;
        player = new Player(view.playerName());
        do {
            System.out.println("This is round: "+(roundNumber+1));
            computerPlayer.takeTurn(ShouldComputerPass());
            view.display(computerPlayer.getName(), computerPlayer.lastScore, roundNumber);

            boolean doesPlayerWantToPass = view.ShouldPlayerPass();
            player.takeTurn(doesPlayerWantToPass);
            view.display(player.getName(), player.lastScore, roundNumber);
            //calculateRoundWinner();
            roundNumber++;

        } while ((!view.exit()) && (roundNumber < 5));
        
        calculateWinner();
        //games++;
        //view.Winner(computerPlayer.getScore(),player.getScore(), );
    }
   

}
