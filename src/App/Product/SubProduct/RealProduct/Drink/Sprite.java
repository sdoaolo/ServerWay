package App.Product.SubProduct.RealProduct.Drink;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Drink;

public class Sprite extends Drink {
    public Sprite() {
        super(MenuProduct.SPRITE.getId(),
                MenuProduct.SPRITE.getName(),
                MenuProduct.SPRITE.getCalorie(),
                MenuProduct.SPRITE.getPrice()
        );
    }
}
