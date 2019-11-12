package services;

import helpers.PriceChecker;
import models.DrinkModel;
import models.MessageModel;
import models.ReportModel;

import java.math.BigDecimal;

public class DrinkServiceImpl implements DrinkServiceI {
    ReportModel report = null;
    public DrinkServiceImpl(ReportModel report) {
        this.report = report == null? new ReportModel(): report;
    }

    public String makeDrink(DrinkModel drink, Double price) {
        if(PriceChecker.isPriceValid(drink,price)){
            System.out.println(drink.toString());
            this.report.noteTransaction(drink);
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
