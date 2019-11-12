package models;
import helpers.Drink;

public class DrinkModel {
    private Drink drink;
    private Integer shugar, stick;
    private boolean extraHot = false;

    public DrinkModel(Drink drink, Integer shugar, boolean extraHot){
        this.drink = drink;
        this.shugar = shugar;
        this.stick = this.shugar != 0? 0:null;
        this.extraHot = extraHot;
    }

    public DrinkModel(helpers.Drink drink){
        this.drink = drink;
        this.shugar = null;
        this.stick = null;
    }

    public Drink getDrinkType() {
        return this.drink;
    }

    public String getDrink() {
        String hot = (this.extraHot && this.drink != Drink.ORANGE)?"h":"";
        return this.drink.getCode()+hot;
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
    public String toString() {
        StringBuilder command = new StringBuilder();
        command.append(this.getDrink()+":");
        command.append(this.getShugar()+":");
        command.append(this.getStick());
        return command.toString();
    }


}
