package App.Product.SubProduct.RealProduct.WedgeAndSoup;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.WedgesAndSoup;

public class BroccoliSoup extends WedgesAndSoup {


    public BroccoliSoup() {
        super(MenuProduct.BROCOLI_SOUP.getId(),
                MenuProduct.BROCOLI_SOUP.getName(),
                MenuProduct.BROCOLI_SOUP.getCalorie(),
                MenuProduct.BROCOLI_SOUP.getPrice(),
                0
        );
    }
}
