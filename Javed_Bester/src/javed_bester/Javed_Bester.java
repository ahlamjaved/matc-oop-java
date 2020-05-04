/*
ITDEV-110
Ahlam Javed
 */
package javed_bester;

/**
 *
 * @author ahlamjaved
 */
public class Javed_Bester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Admin admin = new Admin();
        Computer diceGame = new Computer();
  
        admin.Introduction();
        admin.Directions();
        diceGame.play();
        admin.Goodbye();
       
    }
}
