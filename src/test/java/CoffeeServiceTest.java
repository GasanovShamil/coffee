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
        assertEquals("T::", new DrinkServiceImpl(null).makeDrink(new DrinkModel(Drink.TEA),0.4));
        assertEquals("H:1:0", new DrinkServiceImpl(null).makeDrink(new DrinkModel(Drink.CHOCOLATE,1,false),2.0));
        assertEquals("C::", new DrinkServiceImpl(null).makeDrink(new DrinkModel(Drink.COFFEE,0,false),0.6));
        assertEquals("Ch::", new DrinkServiceImpl(null).makeDrink(new DrinkModel(Drink.COFFEE,0,true),0.6));
        assertEquals("O::", new DrinkServiceImpl(null).makeDrink(new DrinkModel(Drink.ORANGE),0.6));
        assertEquals("M:Not enough money. Please add : 0.2", new DrinkServiceImpl(null).makeDrink(new DrinkModel(Drink.TEA),0.2));
        assertEquals("M:Not enough money. Please add : 0.2", new DrinkServiceImpl(null).makeDrink(new DrinkModel(Drink.CHOCOLATE,1,false),0.3));
        assertEquals("M:Not enough money. Please add : 0.3", new DrinkServiceImpl(null).makeDrink(new DrinkModel(Drink.COFFEE,0,false),0.3));
    }
}
