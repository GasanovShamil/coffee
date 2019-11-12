package services;

import models.DrinkModel;
import models.MessageModel;

public interface DrinkServiceI {

    String makeDrink(DrinkModel drink);

    String sendMessage(MessageModel message);
}
