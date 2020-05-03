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
public class BankController {
    
    View bankView = new View();
    Model bankModel = new Model();
    
    //put view and model together
    public void start() {
        // variables
        String cName;
        double cPrincipal, cInterest, cAccruedAmount;
        int cAge, cRate;
        
        bankView.introduction();
        bankView.directions();
        cName = bankView.getNameFromUser();
        cPrincipal = bankView.getPrincipleAmountFromUser();
        cRate = bankView.getRateFromUser();
        cAge = bankView.getAgeInMonthsFromUser();
        
        bankModel.setName(cName);
        bankModel.setPrincipal(cPrincipal);
        bankModel.setrate(cRate);
        bankModel.setMonth(cAge);
        bankModel.interestCalc();
        
        cInterest = bankModel.getInterest();
        cAccruedAmount = bankModel.getAccruedAmount();
        
        bankView.bankDisplay(cName, cPrincipal, cInterest, cRate, cAccruedAmount);
        
    }
}
