package idcard;
import framework.*;

public class IDCard extends Product {
  private String owner;

  IDCard(String owner) {
    System.out.println(owner + "'s card is created");
    this.owner = owner;
  }
  public void use() {
    System.out.println(owner + "'s card is used");
  }
  public String getOwner() {
    return owner;
  }
}
