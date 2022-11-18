package App.Product.SubProduct.RealProduct.Drink;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Drink;

public class CokeZero extends Drink {

    public CokeZero() {
        super(MenuProduct.COKE_ZERO.getId(),
                MenuProduct.COKE_ZERO.getName(),
                MenuProduct.COKE_ZERO.getCalorie(),
                MenuProduct.COKE_ZERO.getPrice()
        );
    }
}
