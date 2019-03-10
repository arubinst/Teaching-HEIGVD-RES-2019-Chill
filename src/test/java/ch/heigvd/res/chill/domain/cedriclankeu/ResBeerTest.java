package ch.heigvd.res.chill.domain.cedriclankeu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResBeerTest {

  @Test
  void thePriceAndNameForResBeerShouldBeCorrect() {
    ResBeer beer = new ResBeer();
    assertEquals(beer.getName(), ResBeer.NAME);
    assertEquals(beer.getPrice(), ResBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForResBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.cedriclankeu.ResBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = ResBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}