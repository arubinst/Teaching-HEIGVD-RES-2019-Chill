package ch.heigvd.res.chill.domain.adrienbarth;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Chimay implements IProduct {

    public final static String NAME = "Chimay";
    public final static BigDecimal PRICE = new BigDecimal(9.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
