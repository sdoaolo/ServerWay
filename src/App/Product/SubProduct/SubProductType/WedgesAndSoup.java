package App.Product.SubProduct.SubProductType;

import App.Product.SubProduct.Side;

public class WedgesAndSoup extends Side {
    int ketchup;

    public WedgesAndSoup(int id, String name, int calorie, int price, int ketchup) {
        super(id, name, calorie, price);
        this.ketchup = ketchup;
    }
}
