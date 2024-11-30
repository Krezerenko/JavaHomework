package flyweight;

public class CircleData
{
    public double x;
    public double y;
    public double radius;
    private Circle circle;

    public CircleData(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle getCircle()
    {
        return circle;
    }
    public void setCircle(Circle circle)
    {
        this.circle = circle;
    }

    public void draw()
    {
        circle.draw(x, y, radius);
    }
}
