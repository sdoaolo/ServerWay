package App.Product.SubProduct.RealProduct.Cookie;

import App.MenuProduct;
import App.Product.SubProduct.SubProductType.Cookie;

public class DoubleChocoChipCookie extends Cookie {
    public DoubleChocoChipCookie() {
        super(
                MenuProduct.DOUBLE_CHOCO_CHIP_COOKIE.getProductId(),
                MenuProduct.DOUBLE_CHOCO_CHIP_COOKIE.getId(),
                MenuProduct.DOUBLE_CHOCO_CHIP_COOKIE.getName(),
                MenuProduct.DOUBLE_CHOCO_CHIP_COOKIE.getCalorie(),
                MenuProduct.DOUBLE_CHOCO_CHIP_COOKIE.getPrice()
        );
    }
}
