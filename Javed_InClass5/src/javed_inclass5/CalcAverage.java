/*
 Ahlam Javed
ITDEV-110
In Class #5
 */
package javed_inclass5;

/**
 *
 * @author ahlamjaved
 */
public class CalcAverage {
    
    //declaring variables
    private double average;
    private double totalScore;
    private static final int TOTALGAMES=3;
    
    //Constructor + passing in data
    CalcAverage (double game1, double game2, double game3) {
        //initialize total sciore and the average
        totalScore= game1+game2+game3;
        average=totalScore/TOTALGAMES;
    }
    
    public double getaverage() {
        return(average);
    }
    
    public double getTotalScore() {
        return (totalScore);
    }
    
}
