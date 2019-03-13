package ch.heigvd.res.chill.domain.adrienbarth;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Wittekop implements IProduct {

    public final static String NAME = "Wittekop";
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
