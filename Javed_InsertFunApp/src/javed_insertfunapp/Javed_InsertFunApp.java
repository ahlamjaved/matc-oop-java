/*
 Ahlam Javed
ITDEV-110
Assignment #6
 */
package javed_insertfunapp;

/**
 *
 * @author ahlamjaved
 */
public class Javed_InsertFunApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calling the intro method from the Admin class in Main
        Admin beginEnd = new Admin();
       
        Game_Controller controller = new Game_Controller();
        
        
        // Calling the exit method from the Admin class in Main
        do {
            beginEnd.Intro();
            controller.start();
            beginEnd.exitChoice();
        } while (beginEnd.exit == false);
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
