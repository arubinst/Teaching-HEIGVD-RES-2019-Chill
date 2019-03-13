/**
 * created by Aleksandar Milenkovic
 * 22.02.2019
 * 22:56
 */

package ch.heigvd.res.chill.domain.voknelim;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Jelen implements IProduct {

    public final static String NAME = "Jelen";
    public final static BigDecimal PRICE = new BigDecimal(4.1);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}
