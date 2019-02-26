package ch.heigvd.res.chill.domain.ethras;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KwakTest {

    @Test
    void thePriceAndNameForKwakShouldBeCorrect() {
        Kwak beer = new Kwak();
        assertEquals(beer.getName(), Kwak.NAME);
        assertEquals(beer.getPrice(), Kwak.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender bartender = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ethras.Kwak";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = bartender.order(request);
        BigDecimal expectedTotalPrice = Kwak.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}