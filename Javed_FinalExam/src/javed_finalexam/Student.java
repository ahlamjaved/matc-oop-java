/*
 Ahlam Javed
ITDEV-110
Final Exam
 */
package javed_finalexam;

import java.util.Scanner;

/**
 *
 * @author JAVEDAS1
 */
public class Student {
    
    
    String studentName;
    String studentID;
    double[] grades;
    int numOfGrades;
    
    Student (String name, String id){
        studentName = name;
        studentID = id;
        grades = new double[10];
        numOfGrades = 0;
    }
    
    public String toString() {
        return studentName+"\t\t"+studentID;
    }
    
    public void addGrade(double grade) {
        grades[numOfGrades] = grade;
        numOfGrades++;
    }
    
    public double getFinalScore() {
        // TODO
        int sum = 0;
        for (int index = 0; index < grades.length; index++) {
            sum += grades[index];
        }
        return sum / grades.length;
    }
    
    public String getFinalGrade() {
        //Returns the letter grade based on the average score
        
        double average = getFinalScore();
        
        if (average >= 95)
            return "A";    
        else if (average >= 90)
            return "A-";
        else if (average >= 85)
            return "B+";
        else if (average >= 80)
            return "B";
        else if (average >= 75)
            return "B-";
        else if (average > 65)
            return "C+";
        else if (average >= 65)
            return "C";
        else if (average >= 60)
            return "D";
        return "F";
    }
    
}
