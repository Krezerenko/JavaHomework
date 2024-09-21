package homeworks;

import core.Task;
import core.TaskContainer;
import vehicles.Car;

public class Homework2 extends TaskContainer
{
    public Homework2(String name)
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
            Car defaultCar = new Car();
            Car car2 = new Car("1", "2", "3", 4);
            Car car3 = new Car("5", "6", "7");

            System.out.println("Дефолтная машина: " + defaultCar.toString());
            System.out.println("Возраст машины номер 2: " + car2.getAge() + " года");
        }
    }
}
