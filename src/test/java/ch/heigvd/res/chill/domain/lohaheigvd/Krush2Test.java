package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Krush2Test {

    @Test
    void thePriceAndNameForKrush2ShouldBeCorrect() {
        Krush2 beer = new Krush2();
        assertEquals(beer.getName(), Krush2.NAME);
        assertEquals(beer.getPrice(), Krush2.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKrush2() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.Krush2";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Krush2.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}