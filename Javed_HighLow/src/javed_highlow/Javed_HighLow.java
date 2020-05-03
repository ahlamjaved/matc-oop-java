/*
 High Low is a game where the computer picks a number in a defined set, 
example 1-100. The user/player then attempts to guess the number. 
When the player enters their guess, the computer determines if the guess is correct. 
If it is correct the player wins. If the player is incorrect the user is informed 
that the number is either too low or too high. The player keeps on guessing 
until they are correct or they want to quit. 

Ahlam Javed
ITDEV-110
Assignment #7
 */
package javed_highlow;

public class Javed_HighLow {

    
    public static void main(String[] args) {
        // instantiate the Admin class
        
        View begin = new  View();
        
        Admin admin = new Admin();
        
        begin.Intro();
        begin.Directions();
        
      do {  
          
        admin.ComputerGuess();
          
        do {
            admin.NumberFromUser();
            admin.CheckNumbers();
        } while (admin.IsGuessCorrect() == false);
        
        admin.exit();
        
      } while (admin.exit == false);
      
        begin.End();
    }
    
    
    
    
    
    
    
    
}
