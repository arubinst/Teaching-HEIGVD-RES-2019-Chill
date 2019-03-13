package ch.heigvd.res.chill.domain.dorianekaffo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KarmelietTest {

    @Test
    void thePriceAndNameForKarmelietShouldBeCorrect() {
        Karmeliet beer = new Karmeliet();
        assertEquals(beer.getName(), Karmeliet.NAME);
        assertEquals(beer.getPrice(), Karmeliet.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKarmeliet() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.dorianekaffo.Karmeliet";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Karmeliet.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}