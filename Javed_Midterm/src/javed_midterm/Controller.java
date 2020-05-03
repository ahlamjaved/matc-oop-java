/*
Ahlam Javed
ITDEV-110
Midterm Assignment
 */
package javed_midterm;

/**
 *
 * @author ahlamjaved
 */
public class Controller {
    
    //creating an object from the class View
    View view = new View();
    
    public void Start() {
        view.Intro();
        view.Directions();
    }
    
    public void End() {
        view.Closing();
    }
    
}
