package ch.heigvd.res.chill.domain.voknelim;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NiksickoTest {

  @Test
  void thePriceAndNameForNiksickoShouldBeCorrect() {
    Niksicko beer = new Niksicko();
    assertEquals(beer.getName(), Niksicko.NAME);
    assertEquals(beer.getPrice(), Niksicko.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForNiksicko() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.voknelim.Niksicko";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Niksicko.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}