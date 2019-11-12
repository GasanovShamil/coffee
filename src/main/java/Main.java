import helpers.Drink;
import models.DrinkModel;
import models.MessageModel;
import services.DrinkServiceImpl;

public class Main {
    public static void main(String[] args) {
        DrinkServiceImpl coffeeService = new DrinkServiceImpl();
        DrinkModel drink = new DrinkModel(Drink.TEA,2, false);
        MessageModel message = new MessageModel("I need more shugar!");
        coffeeService.makeDrink(drink,0.7);
        coffeeService.sendMessage(message);

    }
}
