/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_romannumerals;

/**
 *
 * @author ahlamjaved
 */
public class Controller {
    
    InputOutput io = new InputOutput();
    numeral numeral = new numeral();
    
    public void Start() {
        numeral.setNumber(io.inputNumber());
        io.displayNumeral(numeral.getNumber(), numeral.calcNumeral());
    }
    
}
