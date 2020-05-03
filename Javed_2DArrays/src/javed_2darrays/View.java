 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_2darrays;

/**
 *
 * @author ahlamjaved
 */
public class View {
    public void printTotal(int total) {
        System.out.println("total:\t\t\t"+total);
    }
    
    public void printAvg(int avg) {
        System.out.println("Avg:\t\t\t"+avg);
    }
    
    public void printRowColumn(int index, String rowcol, int total) {
        System.out.println("Total of "+rowcol+" "+index+" \t"+total);
    }
    
    public void printHiLo(int index, String HiLo, String RowCol, int total) {
        System.out.println(HiLo+"in "+RowCol+" "+index+"\t"+total);
    }
    
    public void printTwoD(int [][] array) {
        System.out.println("Processing the 2D array");
        System.out.println("");
        
        for (int row = 0; row <array.length;row++) {
            System.out.println("----------------");
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(" | "+array[row][col]);
            }
            System.out.println(" | ");
            System.out.println("----------------");
            System.out.println("");
        }  
    }
}
