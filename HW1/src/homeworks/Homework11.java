package homeworks;

import core.Task;
import structs.StackOnQueue;

import java.util.Scanner;

public class Homework11 extends Task
{
    public Homework11(String name)
    {
        super(name);
    }

    @Override
    public void execute()
    {
        StackOnQueue<Integer> stack = new StackOnQueue<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int num = input.nextInt();
        stack.push(num);
        num = input.nextInt();
        stack.push(num);
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println(stack);
    }
}
