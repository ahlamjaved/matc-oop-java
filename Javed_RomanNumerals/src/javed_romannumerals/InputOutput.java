/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_romannumerals;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class InputOutput {
    
    Scanner keyboard = new Scanner(System.in);
    
    public int inputNumber() {
        System.out.println("Enter a number betweeen 1 and 10: ");
        return keyboard.nextInt();
    }
    
    public void displayNumeral(int num, String numeral) {
        System.out.println("The Roman Numeral for the number "+num+" is:\t"+numeral);
    }
    
}
