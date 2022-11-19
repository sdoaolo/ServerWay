package App.Product.SubProduct.SubProductType;

import App.Product.SubProduct.Side;

public class Cookie extends Side {
    private String icon = "🍪";

    public Cookie(int productId, int id, String name, int calorie, int price){
        super(productId, id, name, calorie, price);
    }
    public String getIcon() { return icon; }
}
