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
public class TwoDArrayOperations {
    public int getTotal(int [][] array) {
        int total = 0;
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        }
        return total;
    }
    
    public int getElementCount( int [][] array) {
        int count = 0;
        
        for (int row = 0; row < array.length; row++) {
            count += array[row].length;
    }
}
