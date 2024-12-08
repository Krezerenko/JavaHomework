package homeworks;

import core.Task;
import iterator.ArrayWithIterator;

import java.util.Scanner;

public class Homework14 extends Task
{
    public Homework14(String name)
    {
        super(name);
    }

    @Override
    public void execute()
    {
        String[] temp = new String[5];
        System.out.println("Введите 5 имен.");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            temp[i] = input.nextLine();
        }
        ArrayWithIterator<String> list = new ArrayWithIterator<String>(temp);
        var it = list.getIterator();
        System.out.println("Имена: ");
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
