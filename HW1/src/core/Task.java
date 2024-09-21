package core;

import java.util.Scanner;

public abstract class Task implements IExecutable
{
    public Task(String name)
    {
        this.name = name;
    }
    private final String name;
    public String getName() { return name; }

    @Override
    public void executeFormatted()
    {
        executeFormatted("Задание |\n");
    }

    public void executeFormatted(String text)
    {
        var tokens = text.split("\\|");
        System.out.print(tokens[0]);
        System.out.print(name);
        if (tokens.length > 1)
        {
            System.out.print(tokens[1]);
        }
        execute();
        System.out.print("Нажмите любую кнопку для продолжения...");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println();
    }
}
