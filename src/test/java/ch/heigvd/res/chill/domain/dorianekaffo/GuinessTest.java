package ch.heigvd.res.chill.domain.dorianekaffo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

classGuinessTest {

    @Test
    void thePriceAndNameForGuinessShouldBeCorrect() {
        Guiness beer = new Guiness();
        assertEquals(beer.getName(), Guiness.NAME);
        assertEquals(beer.getPrice(), Guiness.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderFoGuinessl() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.dorianekaffo.Guiness";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Guiness.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}