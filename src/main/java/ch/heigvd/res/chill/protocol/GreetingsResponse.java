package ch.heigvd.res.chill.protocol;

import lombok.Data;

@Data
public class GreetingsResponse implements IMessage {

  private final String text;
  public GreetingsResponse(String greetingsResponse){
    this.text = greetingsResponse;
  }

}
