package homeworks;

import app.TestCar;
import core.Task;
import core.TaskContainer;

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
