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
public class Javed_PracticeObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiating a new object named getReady of the class Admin
        Admin getReady = new Admin();
        getReady.Intro();
        
        //instantiating two new objects named Calc1 and Calc2 of the class MathFun
        MathFun Calc1 = new MathFun();
        MathFun Calc2 = new MathFun();
        
        //Set the number1 and number2 values for both Calc1 and Calc2 with different numbers
        Calc1.setNumber1(15);
        Calc1.setNumber2(4);
        Calc2.setNumber1(5);
        Calc2.setNumber2(34);
        
        
        //get the number1 and number2 values from both Calc1 and Calc2 of the class MathFun and display them
        System.out.println("Calc 1 Number 1:\t\t\t\t"+Calc1.getNumber1());
        System.out.println("Calc 1 Number 2:\t\t\t\t"+Calc1.getNumber2());
        System.out.println("Calc 2 Number 1:\t\t\t\t"+Calc2.getNumber1());
        System.out.println("Calc 2 Number 2:\t\t\t\t"+Calc2.getNumber2());
        System.out.println("");
        
        
        //calling the multiplyThem and addThem methods in Calc1 and display the return value for each
        System.out.println("Calculations for object 1:");
        System.out.println("");
        System.out.println("Number 1:\t\t\t\t\t"+Calc1.getNumber1());
        System.out.println("Number 2:\t\t\t\t\t"+Calc1.getNumber2());
        System.out.println("");
        System.out.println("Product of Number 1 and Number 2:\t\t"+Calc1.MultiplyThem());
        System.out.println("Sum of Number 1 and Number 2:\t\t\t"+Calc1.addThem());
        System.out.println("");
        
        //calling the multiplyThem and addThem methods in Calc2 and display the return value for each
        System.out.println("Calculations for object 2:");
        System.out.println("");
        System.out.println("Number 1:\t\t\t\t\t"+Calc2.getNumber1());
        System.out.println("Number 2:\t\t\t\t\t"+Calc2.getNumber2());
        System.out.println("");
        System.out.println("Product of Number 1 and Number 2:\t\t"+Calc2.MultiplyThem());
        System.out.println("Sum of Number 1 and Number 2:\t\t\t"+Calc2.addThem());
        
        //get the total value from both Calc1 and Calc2 of the class MathFun and display them
        double totalValue= Calc1.addThem()+Calc2.addThem();
        System.out.println("");
        System.out.println("");
        System.out.println("The total sum of all objects is:\t\t"+totalValue);
        System.out.println("");
        
        
        //Calling goodbye method in Admin
        getReady.Goodbye();
  
    }
    
}
