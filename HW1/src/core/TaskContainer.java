package core;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class TaskContainer extends Task
{
    protected Task[] tasks;

    public TaskContainer(String name, Task[] tasks)
    {
        super(name);
        this.tasks = new Task[tasks.length];
        System.arraycopy(tasks, 0, this.tasks, 0, tasks.length);
    }

    public TaskContainer(String name)
    {
        super(name);
        tasks = new Task[0];
    }

    @Override
    public void execute()
    {
        for (Task task : tasks)
        {
            task.execute();
        }
    }

    @Override
    public void executeFormatted()
    {
        executeFormatted("""
                Введите номер задания.
                Для возвращения к выброру предыдущего задания наберите "назад".
                Варианты заданий:
                |назад|Ввод: |Невереный номер задания. Повторите ввод.
                """);
    }

    @Override
    public void executeFormatted(String text)
    {
        var tokens = text.split("\\|");
        while (true)
        {
            System.out.print(tokens[0]);
            for (Task task : tasks)
            {
                System.out.println(task.getName());
            }
            if (tokens.length > 2)
            {
                System.out.print(tokens[2]);
            }
            var input = new Scanner(System.in);
            Optional<Task> foundTask;
            do
            {
                var taskName = input.nextLine();
                if (tokens.length > 1 && taskName.equals(tokens[1])) return;
                foundTask = Arrays.stream(tasks).filter(t -> t.getName().equals(taskName)).findFirst();
                if (foundTask.isEmpty() && tokens.length > 3)
                {
                    System.out.print(tokens[3]);
                }
            }
            while (foundTask.isEmpty());
            System.out.println();
            foundTask.get().executeFormatted();
        }
    }
}
