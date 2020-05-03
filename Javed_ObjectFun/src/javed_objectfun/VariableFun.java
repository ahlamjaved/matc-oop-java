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
public class VariableFun {
    
    private String fName;
    private String lName;
    private int number;
    
    //getters and setters come in pairs
    // allowed user to read and write the fName by setting and getting
    //getters and setters for all 3 data types
    
    public void setFName(String name){
        fName=name;
    }
    
    public String getFName(){
        return fName;
    }
    
    public void setLName(String name){
        lName=name;
    }
    
    public String getLName(){
        return lName;
    }
    
    public void setNumber(int num){
        number= num;
    }
    
    public int getNumber(){
        return number;
    }
    
    public int squaredNumber(){
        return (number*number);
    }
}
