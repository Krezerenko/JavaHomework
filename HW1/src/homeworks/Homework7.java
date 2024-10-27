package homeworks;

import core.Task;
import core.TaskContainer;
import shapes.*;

public class Homework7 extends Task
{
    public Homework7(String name)
    {
        super(name);
    }

    @Override
    public void execute()
    {
        Triangle tr = GeometricInput.getTriangle();
        System.out.println(tr);
        Rectangle rec = GeometricInput.getRectangle();
        Square sq = GeometricInput.getSquare();
        Circle circ = GeometricInput.getCircle();
        System.out.println("Первый сравниваемый круг:");
        ComparableCircle circ1 = GeometricInput.getComparableCircle();
        System.out.println("Второй сравниваемый круг:");
        ComparableCircle circ2 = GeometricInput.getComparableCircle();

        System.out.println("Площадь треугольника: " + tr.getArea());
        System.out.println("Площадь прямоугольника: " + rec.getArea());
        System.out.println("Площадь квадрата: " + rec.getArea());
        System.out.println("Площадь круга: " + circ.getArea());
        System.out.println("Площадь первого сравниваемого круга: " + circ1.getArea());
        System.out.println("Площадь второго сравниваемого круга: " + circ2.getArea());

        System.out.println("Максимальная фигура:\n" + GeometricObject.max(GeometricObject.max(GeometricObject.max(tr, rec), sq), circ));
        System.out.println("Максимальный из двух сравниваемых кругов:\n" + ComparableCircle.max(circ1, circ2));

        System.out.println("Способ раскраски треугольника: 7");
        tr.howToColor();
        System.out.println("Способ раскраски прямоугольника: ");
        rec.howToColor();
        System.out.println("Способ раскраски квадрата: ");
        sq.howToColor();
        System.out.println("Способ раскраски круга: ");
        circ.howToColor();
        System.out.println("Способ раскраски первого сравниваемого круга: ");
        circ1.howToColor();
        System.out.println("Способ раскраски второго сравниваемого круга: ");
        circ2.howToColor();
    }
}
