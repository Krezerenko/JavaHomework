package flyweight;

public class ConcreteCircle implements Circle
{
    private final String color;

    public ConcreteCircle(String color)
    {
        this.color = color;
    }

    @Override
    public void draw(double x, double y, double radius)
    {
        System.out.println(color + " круг по координатам (" + x + ", " + y + ") и радиусом " + radius);
    }
}
