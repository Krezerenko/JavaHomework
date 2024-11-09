package homeworks;

import core.Task;
import structs.GenericStack;
import structs.MyStack;

import java.util.Scanner;

public class Homework10 extends Task
{
    public Homework10(String name)
    {
        super(name);
    }

    @Override
    public void execute()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов стека: ");
        int len = input.nextInt();
        MyStack<String> stack = new MyStack<String>();
        input.nextLine();
        for (int i = 0; i < len; i++)
        {
            stack.push(input.nextLine());
        }
        MyStack<String> stackCopy = stack.clone();
        System.out.println("Стек:\n" + stack);
        System.out.println("Копия стека:\n" + stackCopy);

        System.out.print("Введите новый верхний элемент стека: ");
        String newTop = input.nextLine();
        stackCopy.pop();
        stackCopy.push(newTop);
        System.out.println("Начальный стек:\n" + stack);
        System.out.println("Копия стека:\n" + stackCopy);
        System.out.println();
    }
}
