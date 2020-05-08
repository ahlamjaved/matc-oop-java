/*
ITDEV-110
Ahlam Javed
Bester Game- Assignment #9
 */
package javed_bester;

public class Javed_Bester {

    public static void main(String[] args) {
        
        Admin admin = new Admin();
        Controller diceGame = new Controller();
  
        admin.Introduction();
        admin.Directions();
        diceGame.play();
        admin.Goodbye();
       
    }
}
