package ch.heigvd.res.chill.domain.cedriclankeu;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class kingBeer implements IProduct {

  public final static String NAME = "kingBeer";
  public final static BigDecimal PRICE = new BigDecimal(2.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
