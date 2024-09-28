package homeworks;

import core.Task;
import core.TaskContainer;
import vehicles.Car;
import vehicles.ElectricCar;

public class Homework4 extends TaskContainer
{
    private static class Task4 extends Task
    {
        public Task4(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Car car = new Car();
            ElectricCar electricCar = new ElectricCar();

            System.out.println(car.toString());
            System.out.println(electricCar.toString());
            System.out.println();
            car.setYear(2020);
            car.setModel("model");
            electricCar.setOwnerName("owner");
            electricCar.setBatteryCapacity(100);
            System.out.println(car.toString());
            System.out.println(electricCar.toString());
        }
    }

    public Homework4(String name)
    {
        super(name);
        tasks = new Task[]{ new Task4("4") };
    }
}
