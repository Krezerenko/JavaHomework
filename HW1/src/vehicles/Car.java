package vehicles;

public class Car extends Vehicle
{
    public Car(String model, String license, String color, int year)
    {
        super(model, license, color, year, "Joe", 0, "internal combustion");
    }

    public Car(String model, String license, String color)
    {
        super(model, license, color, 0, "Joe", 0, "internal combustion");
    }

    public Car()
    {
        super("none", "none", "transparent", 0, "Joe", 0, "internal combustion");
    }

    @Override
    String vehicleType()
    {
        return "Car";
    }
}
