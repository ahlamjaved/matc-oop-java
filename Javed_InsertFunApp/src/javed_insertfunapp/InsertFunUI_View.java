/*
 Ahlam Javed
ITDEV-110
Assignment #6
 */

package javed_insertfunapp;

import java.util.Scanner;

/**
 *
 * @author ahlamjaved
 */
public class InsertFunUI_View {
    
    // Variables
    Scanner input = new Scanner(System.in);
    boolean noExit = true;
    String word1, word2, word3, word4, word5;
    
    // inputting words from user then storing in variables
    public void inScreen() {
        System.out.print("Enter a word that is an object:\t\t");
        word1= input.nextLine();
        System.out.print("Enter a word that is an adjective:\t");
        word2= input.nextLine();
        System.out.print("Enter a word that is an adjective:\t");
        word3= input.nextLine();
        System.out.print("Enter a word that is a verb:\t\t");
        word4= input.nextLine();
        System.out.print("Enter a word that is a verb:\t\t");
        word5= input.nextLine();
        
    }
    
    //displaying the 
    public void Poem() {
        System.out.println("");
        System.out.println("I'm a little "+word1);
        System.out.println(word2+" and "+word3);
        System.out.println("Here is my handle");
        System.out.println("Here is my spout");
        System.out.println("When I get all steamed up");
        System.out.println("I just "+word4);
        System.out.println("Tip me over and "+word5+" me out!");
        System.out.println("");
    }
    
}
