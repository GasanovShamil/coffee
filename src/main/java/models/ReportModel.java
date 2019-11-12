package models;

import helpers.Drink;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class ReportModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Map<Drink,Integer> drinkList = new HashMap<Drink,Integer>() {{
        put(Drink.TEA, 0);
        put(Drink.COFFEE, 0);
        put(Drink.CHOCOLATE, 1);
        put(Drink.ORANGE, 0);
    }};
    private Double totalPice = 0.0;

    public void noteTransaction(DrinkModel drink, Double price) {
        this.drinkList.put(drink.getDrinkType(), drinkList.get(drink.getDrinkType()) + 1);
        this.totalPice += price;
    }

    public void getReport(){

        drinkList.forEach((key, value) -> {
            System.out.println("For "+key + " sold : " + value + " drinks!");
        });
        BigDecimal res = BigDecimal.valueOf(totalPice);

        System.out.println("Total amount : " + res.setScale(1, RoundingMode.HALF_UP));

    }

}
