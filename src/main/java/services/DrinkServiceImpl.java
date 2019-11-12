package services;

import models.DrinkModel;
import models.MessageModel;

public class DrinkServiceImpl implements DrinkServiceI {

    public String makeDrink(DrinkModel drink) {
        System.out.println(drink.toString());
        return drink.toString();
    }

    @Override
    public String sendMessage(MessageModel message) {
        System.out.println(message.toString());
        return message.toString();
    }
}
