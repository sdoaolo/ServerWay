package App.Product.SubProduct.SubProductType;

import App.Product.SubProduct.Side;

public class Drink extends Side {
    private String icon = "🥤";
    boolean straw;

    public Drink(int productId,int id, String name, int calorie, int price) {
        super( productId,id, name, calorie, price);
        this.straw = true;
    }
    public String getIcon() { return icon; }
}
