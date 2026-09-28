package gamingconsoles;

public class Main {
    public static void main(String[] args) {

// single dimensional array with city names
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

// two dimensional arraY: each row is a city, colums are PSS, XBOX, SWITCH
        int[][] sales = {
                {1000, 2000, 3000}, // Cape Town
                {2000, 3000, 4000}, // Port Elizabeth
                {1500, 1100, 1200} // Pretoria
        };

        ConsoleSales cs = new ConsoleSales();

// single dimensional to store the total of each city
        int[] totals = new int[cities.length];

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------");
        System.out.printf("%-18s%-10s%-10s%-10s%n", "", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            totals[i] = cs.TotalCitySales(sales[i]); // sales[i] = linha da cidade i
            System.out.printf("%-18s%-10d%-10d%-10d%n",
                    cities[i].toUpperCase(), sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i].toUpperCase(), totals[i]);
        }

        System.out.println("------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cs.TopCity(cities, totals).toUpperCase());
    }
}