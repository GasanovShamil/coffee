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
        assertEquals("T::", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.TEA),0.4));
        assertEquals("H:1:0", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.CHOCOLATE,1),2.0));
        assertEquals("C::", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.COFFEE,0),0.6));
        assertEquals("M:Not enough money. Please add : 0.2", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.TEA),0.2));
        assertEquals("M:Not enough money. Please add : 0.2", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.CHOCOLATE,1),0.3));
        assertEquals("M:Not enough money. Please add : 0.2", new DrinkServiceImpl().makeDrink(new DrinkModel(Drink.COFFEE,0),0.4));
    }
}
