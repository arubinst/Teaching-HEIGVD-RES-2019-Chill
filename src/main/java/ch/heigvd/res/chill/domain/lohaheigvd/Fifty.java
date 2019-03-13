package ch.heigvd.res.chill.domain.lohaheigvd;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Fifty implements IProduct {

    public final static String NAME = "Fifty";
    public final static BigDecimal PRICE = new BigDecimal(2.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
