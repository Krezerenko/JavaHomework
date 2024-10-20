package homeworks;

import core.Task;
import core.TaskContainer;
import shapes.*;

import java.util.Scanner;

public class Homework7 extends TaskContainer
{
    public Homework7(String name)
    {
        super(name);
        tasks = new Task[] { new Task1("1"), new Task2("2"), new Task3("3"), new Task4("4") };
    }

    private static class Task1 extends Task
    {
        public Task1(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Triangle1 tr1 = GeometricInput.getTriangle();
            System.out.println(tr1);
            Rectangle rec = GeometricInput.getRectangle();
            Circle circ = GeometricInput.getCircle();

            System.out.println("Площадь треугольника: " + tr1.getArea());
            System.out.println("Площадь прямоугольника: " + rec.getArea());
            System.out.println("Площадь круга: " + circ.getArea());

            System.out.println("Максимальная фигура: " + GeometricObject.max(GeometricObject.max(tr1, rec), circ));
        }
    }

    private static class Task2 extends Task
    {
        public Task2(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {

        }
    }

    private static class Task3 extends Task
    {
        public Task3(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {

        }
    }

    private static class Task4 extends Task
    {
        public Task4(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {

        }
    }
}
