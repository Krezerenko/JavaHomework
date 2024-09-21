package vehicles;

public class ElectricCar extends Car
{
    public ElectricCar()
    {
        super();
        engineType = "Electric";
    }

    private int batteryCapacity;

    public int getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }
}
