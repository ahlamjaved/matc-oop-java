/*
Ahlam JAved
ITDEV-110
Assignment #8
 */
package javed_highlowgame2;

/**
 *
 * @author ahlamjaved
 */
public class Javed_HighLowGame2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate the Admin class
        
        View begin = new  View();
        
        Admin admin = new Admin();
        
        begin.Intro();
        begin.Directions();
        
      do {  
          
        admin.ComputerGuess();
        admin.GameDifficulty();
          
        do {
            admin.NumberFromUser();
            admin.CheckNumbers();
        } while ((admin.IsGuessCorrect() == false) && (admin.IsAmountEnough() == true));
        
        admin.exit();
        
      } while (admin.exit == false);
      
        begin.End();
    }
    
}
