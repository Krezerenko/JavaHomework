package homeworks;

import core.Task;
import flyweight.CircleData;
import flyweight.CircleFabric;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework13 extends Task
{
    public Homework13(String name)
    {
        super(name);
    }

    @Override
    public void execute()
    {
        CircleFabric fabric = new CircleFabric();
        Scanner input = new Scanner(System.in);

        ArrayList<CircleData> circles = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Введите координаты круга и его радиус: ");
            CircleData circle = new CircleData(input.nextDouble(), input.nextDouble(), input.nextDouble());
            circles.add(circle);
            input.nextLine();
            System.out.print("Введите цвет круга: ");
            circle.setCircle(fabric.getCircle(input.nextLine()));
        }

        System.out.println("Круги: ");
        for (CircleData circle : circles)
        {
            circle.draw();
        }
    }
}
