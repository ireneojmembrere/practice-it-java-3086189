package _02_04;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three methods to set the value of each field, called setDestination,
  // setPrice and setIsReturn.
  public void setDestination(String newDestination){
    this.destination = newDestination;
  }

  public void setPrice(double newPrice){
    this.price = newPrice;
  }

  public void setIsReturn(boolean newIsReturn){
    this.isReturn = newIsReturn;
  }

  // Add a separate method to get the value of each field, called getDestination,
  // getPrice and getIsReturn.

  public String getDestination(){
    return this.destination;
  }

  public double getPrice(){
    return this.price;
  }

  public boolean getIsReturn(){
    return this.isReturn;
  }

}
