package App.Product.SubProduct.RealProduct.Cookie;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Cookie;

public class ChocoChipCookie extends Cookie {
    public ChocoChipCookie() {
        super(
                MenuProduct.CHOCOCHIP_COOKIE.getProductId(),
                MenuProduct.CHOCOCHIP_COOKIE.getId(),
                MenuProduct.CHOCOCHIP_COOKIE.getName(),
                MenuProduct.CHOCOCHIP_COOKIE.getCalorie(),
                MenuProduct.CHOCOCHIP_COOKIE.getPrice()
        );
    }
}
