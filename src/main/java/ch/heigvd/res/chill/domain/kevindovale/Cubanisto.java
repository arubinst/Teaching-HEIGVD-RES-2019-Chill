package ch.heigvd.res.chill.domain.kevindovale;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Cubanisto implements IProduct {

    public final static String NAME = "Cubanisto";
    public final static BigDecimal PRICE = new BigDecimal(1.7);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}