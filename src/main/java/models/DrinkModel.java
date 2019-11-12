package models;
import helpers.Drink;

public class DrinkModel {
    private helpers.Drink drink;
    private Integer shugar, stick;

    public DrinkModel(Drink drink, Integer shugar){
        this.drink = drink;
        this.shugar = shugar;
        this.stick = this.shugar != 0? 0:null;

    }

    public DrinkModel(helpers.Drink drink){
        this.drink = drink;
        this.shugar = null;
        this.stick = null;
    }

    public String getDrink() {
        return this.drink.getCode();
    }

    public void setDrink(helpers.Drink drink) {
        this.drink = drink;
    }

    public String getShugar() {
        return (this.shugar != null && this.shugar != 0)? this.shugar.toString():"";
    }

    public void setShugar(Integer shugar) {
        this.shugar = shugar;
        this.stick = (this.shugar != null && this.shugar != 0)?0:null;
    }

    public String getStick(){
        return (this.stick != null)? this.stick.toString():"";
    }
}
