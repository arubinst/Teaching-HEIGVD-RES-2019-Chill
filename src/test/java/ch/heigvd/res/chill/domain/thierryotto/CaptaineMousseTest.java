package ch.heigvd.res.chill.domain.thierryotto;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CaptaineMousseTest {

    @Test
    void thePriceAndNameForCaptaineMousseShouldBeCorrect() {
        CaptaineMousse beer = new CaptaineMousse();
        assertEquals(beer.getName(), CaptaineMousse.NAME);
        assertEquals(beer.getPrice(), CaptaineMousse.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCaptaineMousse() {
        Bartender bob = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.thierryotto.CaptaineMousse";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = bob.order(request);
        BigDecimal expectedTotalPrice = CaptaineMousse.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}