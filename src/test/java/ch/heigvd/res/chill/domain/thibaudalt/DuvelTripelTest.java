package ch.heigvd.res.chill.domain.thibaudalt;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuvelTripelTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    DuvelTripel beer = new DuvelTripel();
    assertEquals(beer.getName(), DuvelTripel.NAME);
    assertEquals(beer.getPrice(), DuvelTripel.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.thibaudalt.DuvelTripel";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = DuvelTripel.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
