package ch.heigvd.res.chill.domain.adrienbarth;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagnersTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        MagnersTest beer = new MagnersTest();
        assertEquals(beer.getName(), ChimayTest.NAME);
        assertEquals(beer.getPrice(), ChimayTest.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.Magners";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = MagnersTest.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}