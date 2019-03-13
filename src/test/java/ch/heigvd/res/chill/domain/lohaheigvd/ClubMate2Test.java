package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClubMate2Test {

    @Test
    void thePriceAndNameForClubMate2ShouldBeCorrect() {
        ClubMate2 beer = new ClubMate2();
        assertEquals(beer.getName(), ClubMate2.NAME);
        assertEquals(beer.getPrice(), ClubMate2.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForClubMate2() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.ClubMate2";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = ClubMate2.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}