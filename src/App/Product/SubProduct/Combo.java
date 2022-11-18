package App.Product.SubProduct;

import App.Product.SubProduct.SubProductType.Drink;

public class Combo {
    Sandwich sandwich;
    Drink drink;
    public Combo(int calorie, int id, String name, int price, Sandwich sandwich, Drink drink) {
        this.sandwich = sandwich;
        this.drink = drink;
    }
    public Sandwich getSandwich() {
        return sandwich;
    }

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
