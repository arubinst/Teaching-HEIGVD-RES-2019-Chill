package ch.heigvd.res.chill.domain.Enophi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NebuleuseTest {
    @Test
    void thePriceAndNameForNebuleuseShouldBeCorrect() {
        Nebuleuse beer = new Nebuleuse();
        assertEquals(beer.getName(), Nebuleuse.NAME);
        assertEquals(beer.getPrice(), Nebuleuse.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForNebuleuse() {
        Bartender dale = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Enophi.Nebuleuse";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = dale.order(request);
        BigDecimal expectedTotalPrice = Nebuleuse.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}