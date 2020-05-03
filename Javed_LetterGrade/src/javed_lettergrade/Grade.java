/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_lettergrade;

/**
 *
 * @author ahlamjaved
 */
public class Grade {
    
    private double test1, test2, test3;
    
    public void setTest1(double number){
        test1 = number;
    }
    
    public double getTest1() {
        return test1;
    }
    
    public void setTest2(double number) {
        test2 = number;
    }
    
    public double getTest2() {
        return test2;
    }
    
    public void setTest3(double number) {
        test3 = number;
    }
    
    public double getTest3() {
        return test3;
    }
    
    public double calcAverage() {
        return ((test1+test2+test3)/3);
    }
    
    public char calcLetterGrade() {
        double average = calcAverage();
        char grade;
        
        if (average >= 90) {
            grade = 'A';
        }
        
        else if (average >= 80) {
            grade = 'B';  
        }
        
        else if (average >=70) {
            grade = 'C';
        }
        
        else if (average >=60) {
            grade = 'D';
        } else 
            grade = 'F';
        
        return grade;
    }
    
}
