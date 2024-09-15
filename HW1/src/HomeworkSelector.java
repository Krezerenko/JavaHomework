import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class HomeworkSelector
{
    private final Task[] _tasks;

    public HomeworkSelector()
    {
        _tasks = new Task[] { new Homework1("1"), new Homework2("2") };
    }

    public void Start()
    {
        System.out.println("Введите номер работы.");
        System.out.println("Варианты работ:");
        for (Task task : _tasks)
        {
            System.out.println(task.Name());
        }
        var input = new Scanner(System.in);
        Optional<Task> foundHw;
        do
        {
            var hwName = input.nextLine();
            foundHw = Arrays.stream(_tasks).filter(t -> t.Name().equals(hwName)).findFirst();
            if (foundHw.isEmpty())
            {
                System.out.println("Невереный номер работы. Повторите ввод.");
            }
        }
        while (foundHw.isEmpty());
        foundHw.get().ExecuteFormatted();
    }
}
