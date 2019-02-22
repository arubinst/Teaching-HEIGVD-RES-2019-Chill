package ch.heigvd.res.chill.domain.Enophi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliriumTest {

    @Test
    void thePriceAndNameForDeliriumShouldBeCorrect() {
        Delirium beer = new Delirium();
        assertEquals(beer.getName(), Delirium.NAME);
        assertEquals(beer.getPrice(), Delirium.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForDelirium() {
        Bartender joe = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Enophi.Delirium";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = joe.order(request);

        BigDecimal expectedTotalPrice = Delirium.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}