/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_initarray;

/**
 *
 * @author ahlamjaved
 */
public class Javed_InitArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double grades [] = {95.5, 88.6, 79, 82, 91.2, 99, 89, 87, 100, 76.5};
        
        //System.out.println("Length is: " +  grades.length);
        
        for (int index = 0; index < grades.length; index++) {
            System.out.println("Grade " +(index+1)+ ":\t" + grades[index]);
        }
                
    }
    
}
