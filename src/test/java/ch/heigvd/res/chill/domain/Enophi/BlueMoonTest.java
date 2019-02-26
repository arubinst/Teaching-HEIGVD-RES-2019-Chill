package ch.heigvd.res.chill.domain.Enophi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TODO Entête
 *
 * @author david
 * @version 1
 * @since 2019-02-26
 */
class BlueMoonTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        BlueMoon beer = new BlueMoon();
        assertEquals(beer.getName(), BlueMoon.NAME);
        assertEquals(beer.getPrice(), BlueMoon.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender dave = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Enophi.BlueMoon";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = dave.order(request);
        BigDecimal expectedTotalPrice = BlueMoon.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}