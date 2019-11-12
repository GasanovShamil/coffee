package services;

import models.DrinkModel;
import models.MessageModel;

public interface DrinkServiceI {

    String makeDrink(DrinkModel drink, Double price);

    String sendMessage(MessageModel message);
}
