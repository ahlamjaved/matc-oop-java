/*
 Ahlam Javed
ITDEV-110
Final Exam
 */
package javed_finalexam;

/**
 *
 * @author JAVEDAS1
 */
public class Model {
    //Model Class stores all data
   
   Student[] students;
   int numOfStudents;
   
   Model() {
       students = new Student[30];
       numOfStudents = 0;
   }
   
   public void addStudent(Student student) {
       students[numOfStudents] = student;
       numOfStudents++;
   }
   
   public Student[] getAllStudents() {
       return students;
        }
   
   public void addGrade(String studentID, double grade) {
       for (int index = 0; index < students.length; index++) {
           Student student = students[index];
           if (student.studentID.equals(studentID)) {
               student.addGrade(grade); 
           }
       }
   }
}
