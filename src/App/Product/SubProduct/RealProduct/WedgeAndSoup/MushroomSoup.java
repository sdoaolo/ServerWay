package App.Product.SubProduct.RealProduct.WedgeAndSoup;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.WedgesAndSoup;

public class MushroomSoup extends WedgesAndSoup {
    public MushroomSoup() {
        super(MenuProduct.MUSHROOM_SOUP.getId(),
                MenuProduct.MUSHROOM_SOUP.getName(),
                MenuProduct.MUSHROOM_SOUP.getCalorie(),
                MenuProduct.MUSHROOM_SOUP.getPrice(),
                0
        );
    }
}
