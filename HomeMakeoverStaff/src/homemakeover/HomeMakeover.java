package homemakeover;

// Class that does the calculations for the makeover report
public class HomeMakeover {

    // Adds up the jobs of one month (one row of the table)
    public int MonthlyTotal(int[] monthJobs) {
        int total = 0; // stores the running total

        // loop through each type of job in the row
        for (int i = 0; i < monthJobs.length; i++) {
            total += monthJobs[i];
        }

        return total;
    }

    // Decision: returns true if the monthly total is 15 or more
    public boolean IsHighMonth(int total) {
        return total >= 15;
    }
}