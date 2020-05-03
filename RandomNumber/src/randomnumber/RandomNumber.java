/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;

import java.util.Random;
        
public class RandomNumber {

  
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int randomNum;
        int min = 10;
        int offset = 25;
        
        for (int count = 0; count < 20; count++) {
            randomNum = random.nextInt(offset)+min;
            
            if ((randomNum < 10) || (randomNum >  35)) {
            System.out.println(count + " : "+randomNum);
            }
        
        }
    } 
}
