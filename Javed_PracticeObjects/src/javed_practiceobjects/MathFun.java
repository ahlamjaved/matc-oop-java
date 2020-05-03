/*
 Ahlam Javed
ITDEV-110
Assignment #5
 */
package javed_practiceobjects;

/**
 *
 * @author ahlamjaved
 */
public class MathFun {
    
    //Declaring all variables
    private double number1;
    private double number2;
    
    //setting and getting Number1 and Number2
    
    //method that sets number1
    public void setNumber1(int num) {
        number1 = num;
    }
    
    //method that gets number1
    public double getNumber1() {
        return number1;
    }
    
    //method that sets number2
    public void setNumber2(int num) {
        number2 = num;
    }
    
    //method that gerts number2
    public double getNumber2() {
        return number2;
    }
    
    //Method that multiplies
    public double MultiplyThem() {
        return number1 * number2;
    }
    
    //method that adds
    public double addThem() {
        return number1 + number2;
    }
    
}
