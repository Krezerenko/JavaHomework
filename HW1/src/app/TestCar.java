package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar
{
    public void Test()
    {
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        System.out.println("Машины при создании:");
        System.out.println(car.toString());
        System.out.println(electricCar.toString());
        System.out.println();
        car.setYear(2020);
        car.setLicense("1gH2Vh4XsF7");
        car.setModel("model");
        electricCar.setOwnerName("new owner");
        electricCar.setBatteryCapacity(100);
        System.out.println("Машины после изменений:");
        System.out.println(car.toString());
        System.out.println(electricCar.toString());
    }
}
