package ch.heigvd.res.chill.domain.adrienbarth;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeteorTest {

    @Test
    void thePriceAndNameForMeteorShouldBeCorrect() {
        Meteor beer = new Meteor();
        assertEquals(beer.getName(), Meteor.NAME);
        assertEquals(beer.getPrice(), Meteor.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMeteor() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.adrienbarth.Meteor";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Meteor.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}