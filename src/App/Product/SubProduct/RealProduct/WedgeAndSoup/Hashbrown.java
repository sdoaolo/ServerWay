package App.Product.SubProduct.RealProduct.WedgeAndSoup;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.WedgesAndSoup;

public class Hashbrown extends WedgesAndSoup {
    public Hashbrown() {
        super(
                MenuProduct.HASHBROWN.getProductId(),
                MenuProduct.HASHBROWN.getId(),
                MenuProduct.HASHBROWN.getName(),
                MenuProduct.HASHBROWN.getCalorie(),
                MenuProduct.HASHBROWN.getPrice(),
                1
        );
    }
}
