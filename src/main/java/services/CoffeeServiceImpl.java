package services;

import models.DrinkModel;
import models.MessageModel;

public class CoffeeServiceImpl implements CoffeeServiceI {

    public String makeCoffee(DrinkModel drink) {
        StringBuilder command = new StringBuilder();
        command.append(drink.getDrink()+":");
        command.append(drink.getShugar()+":");
        command.append(drink.getStick());
        System.out.println(command);
        return command.toString();
    }

    @Override
    public String sendMessage(MessageModel message) {
        System.out.println(message.toString());
        return message.toString();
    }
}
