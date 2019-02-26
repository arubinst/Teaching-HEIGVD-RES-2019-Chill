package ch.heigvd.res.chill.domain.thibaudalt;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HoegaardenTest {

    @Test
    void thePriceAndNameForDeliriumShouldBeCorrect() {
        Hoegaarden beer = new Hoegaarden();
        assertEquals(beer.getName(), Hoegaarden.NAME);
        assertEquals(beer.getPrice(), Hoegaarden.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForDelirium() {
        Bartender joe = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.thibaudalt.Hoegaarden";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = joe.order(request);
        BigDecimal expectedTotalPrice = Hoegaarden.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}