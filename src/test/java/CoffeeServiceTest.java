import helpers.Drink;
import models.DrinkModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.DrinkServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CoffeeServiceTest {

    @DisplayName("Test MessageService.get()")
    @Test
    void makeCoffeeTest() {
        assertEquals("T::", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.TEA)));
        assertEquals("H:1:0", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.CHOCOLATE,1)));
        assertEquals("C::", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.COFFEE,0)));
    }
}
