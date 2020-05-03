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

//This class controllers the game
public class Game_Controller {
    
    //creating an object from the class InserFunUI_View
    InsertFunUI_View gameView = new InsertFunUI_View();
    
    //This method starts the user input method called inScreen and then displays the poem
    public void start() {
        
        gameView.inScreen();
        gameView.Poem();
    
    }
   
}
