package App.Product.SubProduct;

import App.Product.Product;
import App.Product.SubProduct.SubProductType.Drink;

public class Side extends Product {

    private String icon = "🥪🥤";
    public Side(int productId, int id, String name, int calorie, int price) {
        super(productId,id, name, calorie, price);
    }

    public String getIcon() { return icon; }
}
