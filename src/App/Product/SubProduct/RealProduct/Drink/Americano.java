package App.Product.SubProduct.RealProduct.Drink;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Drink;

public class Americano extends Drink {

    public Americano() {
        super(MenuProduct.AMERICANO.getId(),
                MenuProduct.AMERICANO.getName(),
                MenuProduct.AMERICANO.getCalorie(),
                MenuProduct.AMERICANO.getPrice()
        );
    }
}
