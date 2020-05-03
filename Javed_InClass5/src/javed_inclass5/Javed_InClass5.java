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
public class Javed_InClass5 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        double game1, game2, game3;
        UserInOut uio = new UserInOut();
        
        game1= uio.getGame1();
        game2= uio.getGame2();
        game3= uio.getGame3();
        
        //create a new object called CalcAv of type CalcAverage class then pass in game1-3
        CalcAverage calcAv = new CalcAverage(game1,game2,game3);
        
        uio.displayAverage(calcAv.getTotalScore(), calcAv.getaverage());
    }
    
}
