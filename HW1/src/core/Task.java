package core;

import java.util.Scanner;
import java.util.Set;

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

    public static boolean getLogicalInput()
    {
        Set<String> positive = Set.of("yes", "yeah", "right", "probably", "да", "ага", "наверное", "ну типа");
        Set<String> negative = Set.of("no", "nope", "nah", "not a chance", "нет", "не", "вряд ли", "ни за что");

        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        String answerLowercase = answer.toLowerCase();
        while(!positive.contains(answerLowercase) && !negative.contains(answerLowercase))
        {
            System.out.print("Неверное значение. Введите \"да\" или \"нет\": ");
            answer = input.nextLine();
            answerLowercase = answer.toLowerCase();
        }

        return positive.contains(answerLowercase);
    }
}
