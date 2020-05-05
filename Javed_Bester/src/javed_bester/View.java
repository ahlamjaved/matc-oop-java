/*
ITDEV-110
Ahlam Javed
Bester Game- Assignment #9
 */
package javed_bester;

import java.util.Scanner;

public class View {
    
    Scanner input = new Scanner(System.in);    
    public String playerName(){
        System.out.print("Please enter the players name: ");
        return(input.nextLine());
    }
    
    /*public String NextTurn(){
        System.out.println("Press enter to roll dice");
        return(input.nextLine());
    }*/
    
    public boolean ShouldPlayerPass() {
        System.out.println("Would you like to roll the dice or pass your turn?");
        System.out.println("Enter [p] to pass.");
        System.out.println("Enter any other key to roll.");
        String decision = input.nextLine();
        if (decision.equals("p")) {
            return true;
        } 
        else {
            return false;
        }
    }
    
    public void display(String name, int score, int rollNumber){
        System.out.println();
        System.out.println(name+":\t........................................."+score);
        System.out.println();
        System.out.println();
    }
    
     public void displayWinner(String winner, int score){
        System.out.println("The winner is: "+winner+" with a score of: "+score);
    }
    
    public boolean exit(){
        System.out.println("(0)to exit");
        System.out.println("(1) to roll again.");
        if (input.nextInt()==0){
            input.nextLine();
            return(true);
        }
        else {
            input.nextLine();
            return(false);
        }
            
    }
}
