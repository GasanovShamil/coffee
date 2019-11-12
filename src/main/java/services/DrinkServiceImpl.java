package services;

import helpers.PriceChecker;
import models.DrinkModel;
import models.MessageModel;

import java.math.BigDecimal;

public class DrinkServiceImpl implements DrinkServiceI {

    public String makeDrink(DrinkModel drink, Double price) {
        if(PriceChecker.isPriceValid(drink,price)){
            System.out.println(drink.toString());
            return drink.toString();
        } else {
            return this.sendMessage(new MessageModel("Not enough money. Please add : "+ PriceChecker.getMissingPrice(drink, price)));
        }

    }

    @Override
    public String sendMessage(MessageModel message) {
        System.out.println(message.toString());
        return message.toString();
    }
}
