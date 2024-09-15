import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class TaskContainer extends Task
{
    protected Task[] _tasks;

    public TaskContainer(String name, Task[] tasks)
    {
        super(name);
        _tasks = new Task[tasks.length];
        System.arraycopy(tasks, 0, _tasks, 0, tasks.length);
    }

    public TaskContainer(String name)
    {
        super(name);
        _tasks = new Task[0];
    }

    @Override
    public void Execute()
    {
        for (Task task : _tasks)
        {
            task.Execute();
        }
    }

    @Override
    public void ExecuteFormatted()
    {
        System.out.println("Введите номер задания.");
        System.out.println("Варианты заданий:");
        for (Task task : _tasks)
        {
            System.out.println(task.Name());
        }
        var input = new Scanner(System.in);
        Optional<Task> foundTask;
        do
        {
            var taskName = input.nextLine();
            foundTask = Arrays.stream(_tasks).filter(t -> t.Name().equals(taskName)).findFirst();
            if (foundTask.isEmpty())
            {
                System.out.println("Невереный номер задания. Повторите ввод.");
            }
        }
        while (foundTask.isEmpty());
        foundTask.get().ExecuteFormatted();
    }
}
