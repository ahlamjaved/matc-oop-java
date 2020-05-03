/*
Ahlam Javed
ITDEV-110
Midterm Assignment
 */
package javed_midterm;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class Javed_Midterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating objectcs from Model, Controller and View within the Main
        
        Model model = new Model();
        Controller controller = new Controller();
        controller.Start();
        
        // Calling the exit method from the Admin class in Main
        do {
            model.getScores();
            model.exitChoice();
        } while (model.getExit() == false);

        controller.End();
    }
    
}
