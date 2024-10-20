package shapes;

import core.Task;

import java.util.Scanner;

public class GeometricInput
{
    public static Triangle1 getTriangle()
    {
        Triangle1 tr = new Triangle1();

        Scanner input = new Scanner(System.in);

        System.out.print("Введите стороны треугольника:\n");

        while (true)
        {
            try
            {
                double side1 = input.nextDouble();
                double side2 = input.nextDouble();
                double side3 = input.nextDouble();
                input.nextLine();
                tr.setAllSides(side1, side2, side3);
            }
            catch (IllegalTriangleException e)
            {
                System.out.println("Неправильный треугольник. Повторите попытку.");
                continue;
            }
            break;
        }

        System.out.print("Введите цвет треугольника: ");
        tr.setColor(input.nextLine());

        System.out.print("Треугольник закрашен?\n");
        tr.setFilled(Task.getLogicalInput());

        return tr;
    }

    public static Rectangle getRectangle()
    {
        Rectangle rec = new Rectangle();
        Scanner input = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника: ");
        rec.setWidth(input.nextDouble());

        System.out.print("Введите высоту прямоугольника: ");
        rec.setHeight(input.nextDouble());
        input.nextLine();

        System.out.print("Введите цвет прямоугольника: ");
        rec.setColor(input.nextLine());

        System.out.print("Прямоугольник закрашен?\n");
        rec.setFilled(Task.getLogicalInput());

        return rec;
    }

    public static Circle getCircle()
    {
        Circle circ = new Circle();
        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        circ.setRadius(input.nextDouble());
        input.nextLine();

        System.out.print("Введите цвет круга: ");
        circ.setColor(input.nextLine());

        System.out.print("Круг закрашен?\n");
        circ.setFilled(Task.getLogicalInput());

        return circ;
    }
}
