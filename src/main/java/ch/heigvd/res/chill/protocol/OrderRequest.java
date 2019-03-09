package ch.heigvd.res.chill.protocol;

import lombok.Data;


@Data
public class OrderRequest implements IMessage {

  private final int quantity;
  private final String productName;
  public OrderRequest(int quantity, String productName){
    this.productName = productName;
    this.quantity = quantity;
  }

  public String getProductName(){
    return this.productName;
  }
  public int getQuantity(){
    return this.quantity;
  }

}
