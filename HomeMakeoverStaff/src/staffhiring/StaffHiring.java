package staffhiring;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Subclass that extends the abstract Staff class
public class StaffHiring extends Staff {

    // constructor: passes the values to the parent class using super
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    // prints the report and also saves it to a file
    public void printStaffHiring() {
        System.out.println("STAFF HIRING REPORT");
        System.out.println("*******************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());

        saveReport();
    }

    // writes the same report to a text file called report.txt
    private void saveReport() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("report.txt"))) {
            writer.println("STAFF HIRING REPORT");
            writer.println("*******************");
            writer.println("LOCATION: " + getStaffLocation());
            writer.println("STAFF NUMBER: " + getStaffNumber());
            writer.println("HIRE STAFF: " + getStaffHiringProcess());
        } catch (IOException e) {
            // shows a message if the file could not be saved
            System.out.println("Error saving the file.");
        }
    }
}