package App.Product.SubProduct.RealProduct.Drink;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Drink;

public class Coke extends Drink {

    public Coke() {
        super(MenuProduct.COKE.getId(),
                MenuProduct.COKE.getName(),
                MenuProduct.COKE.getCalorie(),
                MenuProduct.COKE.getPrice()
        );
    }
}
