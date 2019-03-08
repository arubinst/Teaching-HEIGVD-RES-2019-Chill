package ch.heigvd.res.chill.domain.kevindovale;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DesperadoTest {

    @Test
    void getName() {
        Desperado beer = new Desperado();
        assertEquals(beer.getName(), Desperado.NAME);
        assertEquals(beer.getPrice(), Desperado.PRICE);
    }

    @Test
    void getPrice() {

        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.Desperado";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Desperado.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}