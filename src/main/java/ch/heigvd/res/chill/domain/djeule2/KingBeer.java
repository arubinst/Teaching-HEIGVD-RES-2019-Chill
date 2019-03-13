package ch.heigvd.res.chill.domain.djeule2;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class KingBeer implements IProduct {
    public final static String NAME = "KingBeer";
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
