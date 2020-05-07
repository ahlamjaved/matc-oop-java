/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

public class UserInput {
    Scanner input = new Scanner(System.in);
    
    public char selectMark(){
        System.out.println("Please select the mark you will use for the game.");
        System.out.print("x or o: ");
        return(input.next().charAt(0));
    }
    
    
	public int move(){
		System.out.println("Where would you like to move now?");
		System.out.println("1 - upper left\t2 - upper middle\t3 - upper right");	
		System.out.println("4 - middle left\t5 - middle\t\t6 - middle right");
		System.out.println("7 - lower left\t8 - lower middle\t9- lower right");
		return(input.nextInt());
		
	}
	
	public void board(char[][] board){
	
            System.out.println();
            System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
		System.out.println("--------");
		System.out.println(board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
		System.out.println("--------");
		System.out.println(board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
                System.out.println();
	}

    public void error(){
        System.out.println("Error.  Something went wrong.");
    }
}
