package ch.heigvd.res.chill.domain;

import ch.heigvd.res.chill.protocol.GreetingsRequest;
import ch.heigvd.res.chill.protocol.GreetingsResponse;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BartenderTest {



  @Test
  void aBartenderShouldReplyToGreetings() {
    Bartender john = new Bartender();
    GreetingsRequest request = new GreetingsRequest("Hi there");
    GreetingsResponse response = john.greet(request);
    assertEquals("hello, how can I help you?", response.getText());
  }


}