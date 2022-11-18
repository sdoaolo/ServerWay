package App.Product.SubProduct.RealProduct.WedgeAndSoup;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.WedgesAndSoup;

public class Wedgepotato extends WedgesAndSoup {
    public Wedgepotato() {
        super(MenuProduct.WEDGEPOTATOE.getId(),
                MenuProduct.WEDGEPOTATOE.getName(),
                MenuProduct.WEDGEPOTATOE.getCalorie(),
                MenuProduct.WEDGEPOTATOE.getPrice(),
                1
        );
    }
}
