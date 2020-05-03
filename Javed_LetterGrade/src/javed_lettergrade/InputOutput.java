/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_lettergrade;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class InputOutput {
    
    Scanner input = new Scanner(System.in);
    
    public double inputScore(int scoreNumber) {
        System.out.println("Enter Test Score: "+scoreNumber);
        return input.nextDouble();
    }
    
    public void displayAverage(double average) {
        System.out.println("Average Score: "+average);
    }
    
    public void displayLetterGrade(char grade) {
        System.out.println("Letter Grade:\t"+grade);
    }
    
}
