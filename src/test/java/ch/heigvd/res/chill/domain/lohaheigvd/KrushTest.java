package ch.heigvd.res.chill.domain.lohaheigvd;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KrushTest {

    @Test
    void thePriceAndNameForKrushShouldBeCorrect() {
        Krush beer = new Krush();
        assertEquals(beer.getName(), Krush.NAME);
        assertEquals(beer.getPrice(), Krush.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKrush() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.lohaheigvd.Krush";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Krush.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}