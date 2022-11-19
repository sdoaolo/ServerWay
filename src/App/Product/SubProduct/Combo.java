package App.Product.SubProduct;

import App.Product.Product;
import App.Product.SubProduct.SubProductType.Drink;

public class Combo extends Product {


    private String icon = "🥪🥤";
    private Sandwich sandwich;
    private Drink drink;

    public Combo(int productId, int id, String name, int calorie, int price, Sandwich sandwich, Drink drink) {
        super(productId, id, name, calorie, price);
        this.sandwich = sandwich;
        this.drink = drink;
    }
    public  String getIcon() { return icon; }
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
