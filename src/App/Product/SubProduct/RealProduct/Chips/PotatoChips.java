package App.Product.SubProduct.RealProduct.Chips;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Chip;

public class PotatoChips extends Chip {
    public PotatoChips() {
        super(MenuProduct.POTATOCHIPS.getId(),
                MenuProduct.POTATOCHIPS.getName(),
                MenuProduct.POTATOCHIPS.getCalorie(),
                MenuProduct.POTATOCHIPS.getPrice()
        );
    }
}
