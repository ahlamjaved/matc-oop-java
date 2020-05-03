/*
 Ahlam Javed
ITDEV-117
Into to Object Oriented Programming
Assignment #4
 */
package javed_vtipper;

/**
 *
 * @author ahlamjaved
 */
public class Javed_VTipper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // main class
        VTipApp tipper = new VTipApp();
        
        //do loop
        
        //calling the methods from outside the object- therefore need to give name of the object and the method name.
        do{
            tipper.Intro();
            tipper.Directions();
            tipper.InputScreen();
            tipper.TipCalc();
            tipper.TotalBill();
            tipper.exitChoice();
        } while (tipper.noExit);
    }
    
}
