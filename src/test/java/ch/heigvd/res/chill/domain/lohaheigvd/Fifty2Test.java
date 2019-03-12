package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Fifty2Test {

    @Test
    void thePriceAndNameForFifty2ShouldBeCorrect() {
        Fifty2 beer = new Fifty2();
        assertEquals(beer.getName(), Fifty2.NAME);
        assertEquals(beer.getPrice(), Fifty2.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFifty2() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.Fifty2";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Fifty2.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}