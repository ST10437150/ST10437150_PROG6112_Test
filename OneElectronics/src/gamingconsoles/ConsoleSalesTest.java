package gamingconsoles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

class ConsoleSalesTest {

    @Test
    void TotalCitySales_ReturnsExpectedTotal() {
// Arrange
        ConsoleSales cs = new ConsoleSales();
        int[] capeTown = {1000, 2000, 3000};

// Act
        int result = cs.TotalCitySales(capeTown);

// Assert
        assertEquals(6000, result);
    }

    @Test
    void TopCity_ReturnsCityWithMostSales() {
// Arrange
        ConsoleSales cs = new ConsoleSales();
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int[] totals = {6000, 9000, 3800};

// Act
        String result = cs.TopCity(cities, totals);

// Assert
        assertEquals("Port Elizabeth", result);
    }
}