/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_controlflow;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class MakingDecisions {
    //Declarations
    Scanner input = new Scanner(System.in);
    int loopType, executionNumber;
    double squaringNumber;
    boolean noExit = true;

    
    //Constructor
    MakingDecisions(){
        do{
            loopingType();
            squaringNumber();
            iterationNumber();
            squareLoop();
            exitChoice();
        }while (noExit);
    }
    
    public void loopingType(){
        System.out.println("Select the Looping type:");
        System.out.println("(1) While Loop");
        System.out.println("(2) Do Loop");
        loopType=input.nextInt();
    }
    
    public void squaringNumber(){
        System.out.println("Enter the number you'd like to start squaring:");
        squaringNumber=input.nextDouble();
    }
    
    public void iterationNumber(){
        System.out.println("Enter the number of iterations to execute between 1 and 5:");
        executionNumber = input.nextInt();
        if ((executionNumber >5)||(executionNumber <1)){
            System.out.println("Selection out of scope, default set to 3");
            executionNumber=3;
        }
    }
    
    public void squareLoop(){
        int current=1;
        double squared=squaringNumber;
        
        if (loopType==1){
            System.out.println("While Loop.");
            
            while(current<executionNumber+1){
                squared=squared*squared;
                System.out.println("Iterations:\t"+current++);
                System.out.println("Squared:\t"+squared);
            }
        }
        
        if (loopType==2){
            System.out.println("Do-While Loop.");
            
            do{
                squared=squared*squared;
                System.out.println("Iteration:\t"+current++);
                System.out.println("Squared:\t"+squared);
            } while (current<executionNumber+1);
        }
            
    }
    
    public boolean exitChoice(){
        System.out.println("Enter (0) to exit.");
        System.out.println("Enter (1) to continue.");
        int exit=input.nextInt();
        
        if (exit==0){
            noExit=false;
        }
        return noExit;
    }
}
