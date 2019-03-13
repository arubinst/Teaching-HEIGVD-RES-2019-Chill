package ch.heigvd.res.chill.domain.lohaheigvd;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClubMateTest {

    @Test
    void thePriceAndNameForClubMateShouldBeCorrect() {
        ClubMate beer = new ClubMate();
        assertEquals(beer.getName(), ClubMate.NAME);
        assertEquals(beer.getPrice(), ClubMate.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForClubMate() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.lohaheigvd.ClubMate";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = ClubMate.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}