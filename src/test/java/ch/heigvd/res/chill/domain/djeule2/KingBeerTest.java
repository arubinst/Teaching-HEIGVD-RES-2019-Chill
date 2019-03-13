package ch.heigvd.res.chill.domain.djeule2;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KingBeerTest {
    @Test
    void thePriceAndNameForKingBeerShouldBeCorrect() {
        KingBeer beer = new KingBeer();
        assertEquals(beer.getName(), KingBeer.NAME);
        assertEquals(beer.getPrice(), KingBeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKingBeer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.djeule2.KingBeer";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = KingBeer.PRICE.multiply(new BigDecimal(1));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
