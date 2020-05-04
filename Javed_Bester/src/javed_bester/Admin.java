/*
ITDEV-110
Ahlam Javed
Bester Game- Assignment #9
 */
package javed_bester;

public class Admin {
    public void Introduction () {
        System.out.println("Bester is a dice game where players try to play the odds against each other.\n\nEach player rolls five die for up to five rolls.\n\nThe total value of all die is calculated for each roll.\n\nAfter each roll a player can stop if they feel the total value of the roll is sufficient to win.\n\nEach player attempts to beat the total value of the previous players.\n\nThe winner is the one with the highest total after five attempts.");
        System.out.println();
    }
    
    public void Directions () {
        System.out.println("To begin, the computer will roll the 5 die. Then you will roll.\n\nYou can Pass your turn at any time if you feel your score is sufficient.\n ");
    }
    
    public void Goodbye() {
        System.out.println("Thank you for playing Bester!");
    }
}
