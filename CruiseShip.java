/**
   The CruiseShip class stores data about  
   a ship that is a cruise ship for the
   Ship, CruiseShip, and CargoShip Classes 
   programming challenge.
*/

public class CruiseShip extends Ship
{
  private int maxPassengers;

  public CruiseShip(String name, String year, int maxPassengers)
  {
  super(name, year);
  this.maxPassengers = maxPassengers;
  }

  public int getMaxPassengers()
  {
    return maxPassengers;
  }

  public void setMaxPassengers(int maxPassengers)
  {
    this.maxPassengers = maxPassengers;
  }

  @Override
  public String toString()
  {
    return String.format("Name: %s\nMaximum Passengers: %d", getName(), maxPassengers);
  }
}