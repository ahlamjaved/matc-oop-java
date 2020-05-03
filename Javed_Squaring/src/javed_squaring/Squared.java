/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_squaring;

/**
 Definition of the squared object
 */
public class Squared {
    //Constructor
    int sqrRoot;
    
    Squared(int number){
        sqrRoot=number;
    }
    
    public void inputNumber(int num){
        sqrRoot=num;
    }
    
    public int numberSquared(){
        return sqrRoot*sqrRoot;
    }
    
}
