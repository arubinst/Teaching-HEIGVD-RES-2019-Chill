package ch.heigvd.res.chill.domain.thierryotto;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocteurGabsTest {

    @Test
    void thePriceAndNameForDocteurGabsShouldBeCorrect() {
        DocteurGabs beer = new DocteurGabs();
        assertEquals(beer.getName(), DocteurGabs.NAME);
        assertEquals(beer.getPrice(), DocteurGabs.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForDocteurGabs() {
        Bartender bob = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.thierryotto.DocteurGabs";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = bob.order(request);
        BigDecimal expectedTotalPrice = DocteurGabs.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}