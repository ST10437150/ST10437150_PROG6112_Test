package consolestore;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {

// Scanner reads what the user types in the console
        Scanner input = new Scanner(System.in);

// show the menu
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        int choice = input.nextInt();
        input.nextLine(); // clears the Enter left in the buffer

// convert the number into the console name
        String consoleType;
        if (choice == 1) {
            consoleType = "PS5";
        } else if (choice == 2) {
            consoleType = "XBOX";
        } else {
            consoleType = "SWITCH";
        }

// ask for the store name
        System.out.print("Enter the store: ");
        String store = input.nextLine();

// ask for the total sales
        System.out.print("Enter the total sales of " + consoleType
                + " consoles for " + store + ": ");
        int totalSales = input.nextInt();

// create the object and print the report
        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        System.out.println();
        sales.printReport();
    }
}