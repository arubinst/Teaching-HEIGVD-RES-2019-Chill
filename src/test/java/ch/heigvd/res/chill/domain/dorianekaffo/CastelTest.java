package ch.heigvd.res.chill.domain.dorianekaffo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CastelTest {

    @Test
    void thePriceAndNameForCastelShouldBeCorrect() {
        Castelt beer = new Castel();
        assertEquals(beer.getName(), Castel.NAME);
        assertEquals(beer.getPrice(), Castel.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCastel() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.dorianekaffo.Castel";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Castel.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}