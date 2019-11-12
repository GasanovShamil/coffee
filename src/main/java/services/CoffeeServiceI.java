package services;

import models.DrinkModel;
import models.MessageModel;

public interface CoffeeServiceI {

    String makeCoffee(DrinkModel drink);

    String sendMessage(MessageModel message);
}
