package consolestore;

// Subclass that extends the abstract Consoles class
public class ConsoleSales extends Consoles {

    // constructor: passes the values up to the parent class using super
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // prints the report with the console type, store name and total sales
    public void printReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}