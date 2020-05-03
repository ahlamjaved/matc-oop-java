/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_bankcalcmvc;

/**
 *
 * @author ahlamjaved
 */
public class Model {
    
    // defining all the variables
    private int rate, month;
    private String name;
    private double principal, interest, accruedAmount;
    private final double PERCENT = 100;
    private final double YEAR = 12;
    
    public int getRate() {
        return rate;
    }
    
    public void setrate(int rt) {
        rate = rt;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int mon) {
        month = mon;
    }
    
    public double getInterest() {
        return interest;
    }
    
    public void setInterest(double interest) {
        this.interest = interest;
    }
    
    public void setPrincipal(double prin) {
        principal = prin;
    }
    
    public double getAccruedAmount() {
        return accruedAmount;
    }
    
    public void setAccruedAmount(double aAmount) {
        accruedAmount = aAmount;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void interestCalc(){
        double decimalRate = rate/PERCENT;
        double time = month/YEAR;
        interest = decimalRate*time;
        accruedAmount = principal*interest;
    }
    
}
