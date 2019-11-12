package helpers;

public enum Drink {
    TEA("T"),
    COFFEE("C"),
    CHOCOLATE("H");

    private String drinkCode;

    Drink(String drinkCode) {
        this.drinkCode = drinkCode;
    }

    public String getCode() {
        return drinkCode;
    }
}
