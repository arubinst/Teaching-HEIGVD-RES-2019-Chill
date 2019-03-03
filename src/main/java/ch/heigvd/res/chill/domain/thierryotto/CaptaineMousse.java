package ch.heigvd.res.chill.domain.thierryotto;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class CaptaineMousse implements IProduct {

  public final static String NAME = "Cap'Taine Mousse";
  public final static BigDecimal PRICE = new BigDecimal(3.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
