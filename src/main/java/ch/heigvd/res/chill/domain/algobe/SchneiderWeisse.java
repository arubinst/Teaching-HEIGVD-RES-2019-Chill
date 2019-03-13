package ch.heigvd.res.chill.domain.algobe;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SchneiderWeisse implements IProduct {

  public final static String NAME = "Schneider Weisse";
  public final static BigDecimal PRICE = new BigDecimal(5.5);

  @Override
  public String getName() {
      return NAME;
  }

  @Override
  public BigDecimal getPrice() {
        return PRICE;
    }
}
