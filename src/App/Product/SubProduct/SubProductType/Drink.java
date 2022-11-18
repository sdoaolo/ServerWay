package App.Product.SubProduct.SubProductType;

import App.Product.SubProduct.Side;

public class Drink extends Side {
    boolean straw;

    public Drink(int id, String name, int calorie, int price) {
        super(id, name, calorie, price);
        this.straw = true;
    }
}
