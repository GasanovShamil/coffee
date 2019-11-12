import helpers.Drink;
import models.DrinkModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.CoffeeServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CoffeeServiceTest {

    @DisplayName("Test MessageService.get()")
    @Test
    void makeCoffeeTest() {
        assertEquals("T::", new CoffeeServiceImpl().makeCoffee(new DrinkModel(Drink.TEA)));
        assertEquals("H:1:0", new CoffeeServiceImpl().makeCoffee(new DrinkModel(Drink.CHOCOLATE,1)));
        assertEquals("C::", new CoffeeServiceImpl().makeCoffee(new DrinkModel(Drink.COFFEE,0)));
    }
}
