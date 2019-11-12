package helpers;

import models.DrinkModel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PriceChecker {

    private static final Map<Drink,Double> priceList = new HashMap<Drink,Double>() {{
        put(Drink.TEA, 0.4);
        put(Drink.COFFEE, 0.6);
        put(Drink.CHOCOLATE, 0.5);
    }};




    public static boolean isPriceValid(DrinkModel drink, Double price) {

        return price >= priceList.get(drink.getDrinkType());
    }

    public static BigDecimal getMissingPrice(DrinkModel drink, Double price){
        BigDecimal res = BigDecimal.valueOf(priceList.get(drink.getDrinkType()) - price);
        return res.setScale(1, RoundingMode.HALF_UP);
    }
}
