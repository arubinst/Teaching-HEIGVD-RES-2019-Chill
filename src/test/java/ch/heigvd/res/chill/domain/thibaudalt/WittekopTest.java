package ch.heigvd.res.chill.domain.thibaudalt;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WittekopTest {

    @Test
    void thePriceAndNameForWittekopShouldBeCorrect() {
        Wittekop beer = new Wittekop();
        assertEquals(beer.getName(), Wittekop.NAME);
        assertEquals(beer.getPrice(), Wittekop.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForWittekop() {
        Bartender joe = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.thibaudalt.Wittekop";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = joe.order(request);
        BigDecimal expectedTotalPrice = Wittekop.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}