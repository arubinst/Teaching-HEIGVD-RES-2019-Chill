package ch.heigvd.res.chill.domain.djeule2;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastelbeerTest {
    @Test
    void thePriceAndNameForKingBeerShouldBeCorrect() {
        Castelbeer beer = new Castelbeer();
        assertEquals(beer.getName(), Castelbeer.NAME);
        assertEquals(beer.getPrice(), Castelbeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKingBeer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.djeule2.Castelbeer";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Castelbeer.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
