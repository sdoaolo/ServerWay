package App.Product.SubProduct.SubProductType;

import App.Product.SubProduct.Side;

public class Chip extends Side {
    private String icon = "🍘";
    public Chip(int productId, int id, String name, int calorie, int price) {
        super(productId, id, name, calorie, price);
    }
    public String getIcon() { return icon; }
}
