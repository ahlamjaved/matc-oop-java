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
public class View {
    //View class is solely used for user input and output
    
    Scanner input = new Scanner(System.in);
    
    public void Begin() {
       System.out.println("\t\t\t\tClass Gradebook");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println(" ");
    }
    
    public void Intro() {
        System.out.println("Menu Options:\n\n");
    }
    
   public Student getStudentFromUser() {
       //getting student info
      
       System.out.print("Enter student name:\t\t");
       String studentName = input.nextLine();
       System.out.print("Enter student ID number:\t");
       String studentID = input.nextLine();
       
       Student student = new Student(studentName,studentID);
       return student;
   } 
   
   public int displayMenuOptions() {
       //Initial Menu Options
       System.out.println("Please select from the following options:\t\t[1] Add Student\t\t[2] Add Grade\n\t\t\t\t\t\t\t[3] View All Students\t[4] Exit");
       int menuOption = input.nextInt();
       input.nextLine();
       return menuOption;
   }
   
   public void displayAllStudents(Student[] students) {
       //iterating over the array using a while-loop to print the students
       System.out.println("Student Name:\tStudent ID:");
       int index = 0;
       while (index < students.length && students[index] != null) {
           System.out.println(students[index]);
           index++;
       }
    }
   
   public String getStudentIDFromUser() {
       System.out.print("Enter student ID: ");
       String studentID = input.nextLine();
       return studentID;
   }
   
   public double getGradeFromUser() {
       System.out.print("Enter student ID: ");
       double grade = input.nextDouble();
       input.nextLine();
       return grade;
   }
}
