package ch.heigvd.res.chill.domain.djeule2;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KadjibeerTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    KadjiBeer beer = new KadjiBeer();
    assertEquals(beer.getName(), KadjiBeer.NAME);
    assertEquals(beer.getPrice(), KadjiBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.djeule2.KadjiBeer";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = KadjiBeer.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}