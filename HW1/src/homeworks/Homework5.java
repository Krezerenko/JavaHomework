package homeworks;

import vehicles.TestCar;
import core.Task;

public class Homework5 extends Task
{
    public Homework5(String name)
    {
        super(name);
    }

    @Override
    public void execute()
    {
        TestCar tester = new TestCar();
        tester.Test();
    }
}
