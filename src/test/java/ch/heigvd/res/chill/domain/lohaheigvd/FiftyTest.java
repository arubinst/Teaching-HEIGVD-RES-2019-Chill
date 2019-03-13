package ch.heigvd.res.chill.domain.lohaheigvd;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FiftyTest {

    @Test
    void thePriceAndNameForFiftyShouldBeCorrect() {
        Fifty beer = new Fifty();
        assertEquals(beer.getName(), Fifty.NAME);
        assertEquals(beer.getPrice(), Fifty.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFifty() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.lohaheigvd.Fifty";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Fifty.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}