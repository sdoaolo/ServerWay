package App.Product.SubProduct.RealProduct.Cookie;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Cookie;

public class RasberryCheeseCookie extends Cookie {
    public RasberryCheeseCookie() {
        super(MenuProduct.RASBERRY_CHEESE_COOKIE.getId(),
                MenuProduct.RASBERRY_CHEESE_COOKIE.getName(),
                MenuProduct.RASBERRY_CHEESE_COOKIE.getCalorie(),
                MenuProduct.RASBERRY_CHEESE_COOKIE.getPrice()
        );
    }
}
