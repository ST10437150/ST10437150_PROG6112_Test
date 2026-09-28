package staffhiring;

import java.util.Scanner;

public class UseStaff {
    public static void main(String[] args) {

        // Scanner reads what the user types in the console
        Scanner input = new Scanner(System.in);

        // ask for the current staff number
        System.out.print("Enter the current staff number: ");
        int staffNumber = input.nextInt();
        input.nextLine(); // clears the Enter left in the buffer

        // ask for the location
        System.out.print("Enter the staff hiring location: ");
        String location = input.nextLine();

        // create the object and print the report
        StaffHiring hiring = new StaffHiring(staffNumber, location);
        System.out.println();
        hiring.printStaffHiring();
    }
}