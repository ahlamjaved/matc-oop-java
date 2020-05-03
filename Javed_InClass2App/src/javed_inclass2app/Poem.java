/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_inclass2app;

/**
 *
 * @author ahlamjaved
 */
public class Poem {
    
    Poem(){
        System.out.println("Beginning of poem constructor");
        displayPoem(); 
        System.out.println("Ending of poem constructor");
    }
    
    public void displayPoem(){
        System.out.println("Beginning of displayPoem");
        System.out.println("Twinkle Twinkle Little Star");
        System.out.println("Ending of displayPoem");
    }
    
}
