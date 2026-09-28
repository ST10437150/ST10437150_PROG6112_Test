package homemakeover;

public class Main {
    public static void main(String[] args) {

        // single-dimensional array with the month names
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};

        // two-dimensional array: each row is a month, columns are Bathrooms, Kitchens, Garden
        int[][] jobs = {
                {8, 2, 5},  // January
                {7, 4, 5},  // February
                {5, 5, 2},  // March
                {2, 2, 3},  // April
                {7, 7, 9},  // May
                {7, 8, 5}   // June
        };

        // object used to call the calculation methods
        HomeMakeover hm = new HomeMakeover();

        // single-dimensional array to store the total of each month
        int[] totals = new int[months.length];

        // print the report heading and the column names
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("--------------------------------------------");
        System.out.printf("%-8s%-12s%-12s%-12s%n", "", "Bathrooms", "Kitchens", "Garden");

        // loop through each month, calculate its total and print its row
        for (int i = 0; i < months.length; i++) {
            totals[i] = hm.MonthlyTotal(jobs[i]); // jobs[i] is one row of the table
            System.out.printf("%-8s%-12d%-12d%-12d%n",
                    months[i], jobs[i][0], jobs[i][1], jobs[i][2]);
        }

        // print the monthly totals
        System.out.println("--------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < months.length; i++) {
            String stars = ""; // stays empty unless the total is 15 or more

            // decision statement: add three stars if the total is 15 or more
            if (hm.IsHighMonth(totals[i])) {
                stars = "***";
            }

            System.out.printf("%-8s%-12d%s%n", months[i], totals[i], stars);
        }
    }
}