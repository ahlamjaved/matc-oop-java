/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_objectfun;

/**
 *
 * @author ahlamjaved
 */
public class Javed_ObjectFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate the class/ object
        VariableFun fun = new VariableFun();
        VariableFun funOne = new VariableFun();
        VariableFun funTwo = new VariableFun();
        
        // in order to call outside the class, must call the fully qualified name
        //fName is underlined in red, bc it is private access, so cant use
        //fun.fName= "john";
        
        //proper way to do it when the class is private
        //Called our sets and passed in the data
        fun.setFName("John");
        fun.setLName("Smith");
        fun.setNumber(7);
        
        //same class but different objects
        funOne.setFName("Mary");
        funOne.setLName("Williams");
        funOne.setNumber(3);
        
        //Setting the thrid object
        funTwo.setFName("Lilly");
        funTwo.setLName("Jefferson");
        funTwo.setNumber(5);
        
        //How we invoke our method outside of the class method.get.objectname
        //Printing out the fun object
        System.out.println("Fun: First Name: "+fun.getFName());
        System.out.println("Fun: Last Name: "+fun.getLName());
        System.out.println("Fun: Number: "+fun.getNumber());
        System.out.println("Fun: Number Squared: "+fun.squaredNumber());
        
        //printing out the funOne object
        System.out.println("FunOne: First Name: "+funOne.getFName());
        System.out.println("FunOne: Last Name: "+funOne.getLName());
        System.out.println("FunOne: Number: "+funOne.getNumber());
        System.out.println("FuntOne: Number Squared: "+funOne.squaredNumber());
        
        //printing out the funTwo object
        System.out.println("FunTwo: First Name: "+funTwo.getFName());
        System.out.println("FuntTwo: Last Name: "+funTwo.getLName());
        System.out.println("FunTwo: Number: "+funTwo.getNumber());
        System.out.println("FunTwo: Number Squared: "+funTwo.squaredNumber());
    }
    
    
}
