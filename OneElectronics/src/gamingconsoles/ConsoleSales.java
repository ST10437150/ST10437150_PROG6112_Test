package gamingconsoles;

public class ConsoleSales implements IConsoleSales {

    // adds up the sales of three consoles for one city
    @Override
    public int TotalCitySales(int[] citySales) {
        int total = 0;
        for (int i = 0; i < citySales.length; i++) {
            total += citySales[i];
        }
        return total;
    }

    // finds the city with the highest total and returns its name
    @Override
    public String TopCity(String[] cities, int[] totalSales) {
        int maxIndex = 0; // posição do maior valor encontrado até agora
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        return cities[maxIndex];
    }
}