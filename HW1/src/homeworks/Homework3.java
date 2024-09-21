package homeworks;

import core.Task;
import core.TaskContainer;
import vehicles.Car;
import vehicles.ElectricCar;

public class Homework3 extends TaskContainer
{
    public Homework3(String name)
    {
        super(name);
        tasks = new Task[] { new Task2("2") };
    }

    private static class Task2 extends Task
    {

        public Task2(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Car car = new Car();
            ElectricCar electricCar = new ElectricCar();
            electricCar.setColor("blue");

            System.out.println("Цвет машины: " + car.getColor());
            System.out.println("Цвет электромашины: " + electricCar.getColor());
            System.out.println("Двигатель машины: " + car.getEngineType());
            System.out.println("Двигатель электромашины: " + electricCar.getEngineType());
        }
    }
}
