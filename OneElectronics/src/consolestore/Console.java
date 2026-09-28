package consolestore;

// Abstract class that stores the console data
abstract class Consoles implements IConsoles {

    // variables to store the data
    private String consoleType;
    private String store;
    private int totalSales;

    // constructor that receives the three values as parameters
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // methods to get each value
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}