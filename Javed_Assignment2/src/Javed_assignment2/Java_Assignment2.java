// Ahlam Javed
// ITDEV-110
// Assignment #2
package Javed_assignment2;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

/**
 *
 * @author ahlamjaved
 */
public class Java_Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // printing string for current time
       System.out.print("The current time is: ");
       // Create an  object that displays that formats the date
       DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
       // creating a date object of the current time
       Date rightNow = new Date();
       // printing the date format accorsding to the date format specified
       System.out.println(dateFormat.format(rightNow)); //HH:mm:ss
       // Instantiating a new object called Me from the AboutMe class
       AboutMe me = new AboutMe();
        
    }
    
}
