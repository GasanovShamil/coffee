package services;
import helpers.Drink;
import helpers.PriceChecker;
import models.DrinkModel;
import models.MessageModel;
import models.ReportModel;
import org.mockito.InjectMocks;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

public class DrinkServiceImpl implements DrinkServiceI {

    ReportModel report = null;
    OverageQuantityCheckerImpl quantityChecker = null;

    public DrinkServiceImpl(ReportModel report, OverageQuantityCheckerImpl quantityChecker) {
        this.report = report == null? new ReportModel(): report;
        this.quantityChecker = quantityChecker == null? new OverageQuantityCheckerImpl(): quantityChecker;
    }

    public String makeDrink(DrinkModel drink, Double price) {
        if(quantityChecker.isEmpty(drink.getDrinkType())){
            return this.sendMessage(new MessageModel("This drink is not available!"));
        } else if(PriceChecker.isPriceValid(drink,price)){
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
