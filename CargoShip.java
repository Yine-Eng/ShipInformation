/**
   The CargoShip class stores data about  
   a ship that is a cargo ship for the
   Ship, CruiseShip, and CargoShip Classes 
   programming challenge.
*/

public class CargoShip extends Ship
{
  private int cargoCapacity;

  public CargoShip(String name, String year, int cargoCapacity)
  {
    super (name, year);
    this.cargoCapacity = cargoCapacity;
  }

  public int getCargoCapacity()
  {
    return cargoCapacity;
  }

  public void setCargoCapacity(int cargoCapacity)
  {
    this.cargoCapacity = cargoCapacity;
  }
  
  @Override
  public String toString()
  {
    return String.format("Name: %s\nCargo Capacity: %d", getName(), cargoCapacity);
  }
}