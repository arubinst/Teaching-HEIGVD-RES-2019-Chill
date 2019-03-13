package ch.heigvd.res.chill.domain.cedriclankeu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoosterBeerTest {

  @Test
  void thePriceAndNameForBoosterBeerShouldBeCorrect() {
    BoosterBeer beer = new BoosterBeer();
    assertEquals(beer.getName(), BoosterBeer.NAME);
    assertEquals(beer.getPrice(), BoosterBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoosterBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.cedriclankeu.BoosterBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BoosterBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}