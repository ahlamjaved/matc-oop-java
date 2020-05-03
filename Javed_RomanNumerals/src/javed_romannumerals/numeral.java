/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_romannumerals;

/**
 *
 * @author ahlamjaved
 */
public class numeral {
    
    private int number; 
    
    public void setNumber(int num) {
        number = num;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String calcNumeral() {
        String numeral;
        
        switch(number) {
            case 1: numeral = "I";
                    break;
            case 2: numeral = "II";
                    break;
            case 3: numeral = "III";
                    break;
            case 4: numeral = "IV";
                    break;
            case 5: numeral = "V";
                    break;
            case 6: numeral = "VI";
                    break;
            case 7: numeral = "VII";
                    break;
            case 8: numeral = "VIII";
                    break;
            case 9: numeral = "IX";
                    break;
            case 10: numeral = "X";
                    break;
            default:
                    numeral = "Error";
        }
        return numeral;
    }
}
