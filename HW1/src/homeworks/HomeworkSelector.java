package homeworks;

import core.Task;
import core.TaskContainer;

public class HomeworkSelector extends TaskContainer
{
    public HomeworkSelector()
    {
        super("root");
        tasks = new Task[] { new Homework1("1"), new Homework2("2"), new Homework3("3"), new Homework4("4"), new Homework5("5"), new Homework7("7") };
    }

    @Override
    public void executeFormatted()
    {
        executeFormatted("""
                Введите номер работы.
                Для выхода наберите "выход".
                Варианты работ:
                |выход|Ввод: |Невереный номер работы. Повторите ввод.
                """);
    }
}
