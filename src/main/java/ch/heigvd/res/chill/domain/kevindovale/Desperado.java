package ch.heigvd.res.chill.domain.kevindovale;


import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Desperado implements IProduct {

    public final static String NAME = "Desperado";
    public final static BigDecimal PRICE = new BigDecimal(3.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
