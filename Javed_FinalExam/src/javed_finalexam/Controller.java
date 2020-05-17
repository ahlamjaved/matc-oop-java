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
public class Controller {
    View view;
    Model model;
    
    Controller() {
        // controller class connects to the model and view and runs the program
        view = new View();
        model = new Model();
    }
 
    public void openGradeBook() {
        view.Begin();
        view.Intro();
        int menuOption;
        
        do {
            menuOption = view.displayMenuOptions();
            if (menuOption == 1) {
                Student newStudent = view.getStudentFromUser();
                model.addStudent(newStudent);
            }
            if (menuOption == 3) {
                view.displayAllStudents(model.getAllStudents());
            }
            if (menuOption == 2) {
                String studentID = view.getStudentIDFromUser();
                double grade = view.getGradeFromUser();
                model.addGrade(studentID, grade);
                
            }
        } while (menuOption != 4);
    }
}
