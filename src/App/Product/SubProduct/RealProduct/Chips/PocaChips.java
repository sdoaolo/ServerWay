package App.Product.SubProduct.RealProduct.Chips;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Chip;

public class PocaChips extends Chip {
    public PocaChips(){
        super(MenuProduct.POCACHIPS.getId(),
                MenuProduct.POCACHIPS.getName(),
                MenuProduct.POCACHIPS.getCalorie(),
                MenuProduct.POCACHIPS.getPrice()
        );
    }
}
