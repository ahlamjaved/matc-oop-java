/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_simplearray;

/**
 *
 * @author ahlamjaved
 */

//controller class
public class Controller {
    Output output = new Output();
    SimpleArray simple = new SimpleArray();
    
    public void Start() {
        output.displayHeader();
        
        for (int index = 0; index < simple.getArraySize();index++) {
            output.displayArrayElement(index, simple.getElementAt(index));
        }
    }
    
}
