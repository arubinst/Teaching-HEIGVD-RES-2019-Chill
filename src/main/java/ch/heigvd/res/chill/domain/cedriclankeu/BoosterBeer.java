package ch.heigvd.res.chill.domain.cedriclankeu;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BoosterBeer implements IProduct {

  public final static String NAME = "BoosterBeer";
  public final static BigDecimal PRICE = new BigDecimal(6.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
