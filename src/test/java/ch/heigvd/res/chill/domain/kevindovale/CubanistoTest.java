package ch.heigvd.res.chill.domain.kevindovale;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CubanistoTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Cubanisto beer = new Cubanisto();
        assertEquals(beer.getName(), Cubanisto.NAME);
        assertEquals(beer.getPrice(), Cubanisto.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.kevindovale.Cubanisto";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Cubanisto.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}