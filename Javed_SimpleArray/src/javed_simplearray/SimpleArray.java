/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_simplearray;

/**
 *
 * @author ahlamjaved
 */

//Model Class
public class SimpleArray {
    /*String[] month = {
        "Jan",
        "Feb",
        "Mar",
        "Apr",
        "May",
        "June",
        "July",
        "Aug",
        "Sep",
        "Oct",
        "Nov",
        "Dec"
    };*/
    
    String [] day = {
        "Mon",
        "Tue",
        "Wed",
        "Thur",
        "Fri",
        "Sat",
        "Sun"
    };
    
    public String getElementAt(int index) {
        //return month[index];
        return day[index];
    }
    
    public int getArraySize() {
        //return month.length;  
        return day.length;
    }
    
}
