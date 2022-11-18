package App.Product.SubProduct.RealProduct.Chips;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Chip;

public class SwingChips extends Chip {
    public SwingChips() {

        super(MenuProduct.SWINGCHIPS.getId(),
                MenuProduct.SWINGCHIPS.getName(),
                MenuProduct.SWINGCHIPS.getCalorie(),
                MenuProduct.SWINGCHIPS.getPrice()
        );
    }
}
