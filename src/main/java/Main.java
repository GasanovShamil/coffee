import helpers.Drink;
import models.DrinkModel;
import models.MessageModel;
import services.CoffeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        CoffeeServiceImpl coffeeService = new CoffeeServiceImpl();
        DrinkModel drink = new DrinkModel(Drink.TEA,2);
        MessageModel message = new MessageModel("I need more shugar!");
        coffeeService.makeCoffee(drink);
        coffeeService.sendMessage(message);

    }
}
