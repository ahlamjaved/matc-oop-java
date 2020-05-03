/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javed_lettergrade;

/**
 *
 * @author ahlamjaved
 */
public class Controller {
    
    Grade grade = new Grade();
    InputOutput io = new InputOutput();
    
    public void Start() {
        
        grade.setTest1(io.inputScore(1));
        grade.setTest2(io.inputScore(2));
        grade.setTest3(io.inputScore(3));
        
        io.displayAverage(grade.calcAverage());
        io.displayLetterGrade(grade.calcLetterGrade());
        
        /*double controllerScore1;
        controllerScore1 = io.inputScore(1);
        grade.setTest1(controllerScore1);*/
    }
    
}
