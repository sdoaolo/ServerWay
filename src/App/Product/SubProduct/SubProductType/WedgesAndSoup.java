package App.Product.SubProduct.SubProductType;

import App.Product.SubProduct.Side;

public class WedgesAndSoup extends Side {
    protected String icon = "🍟🥫";
    int ketchup;

    public WedgesAndSoup(int productId, int id, String name, int calorie, int price, int ketchup) {
        super(productId,id, name, calorie, price);
        this.ketchup = ketchup;
    }
    public String getIcon() { return icon; }
}
