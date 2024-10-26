package shapes;

public class Square extends GeometricObject
{
    private double side;

    public Square(double side)
    {
        this.side = side;
    }

    public Square()
    {
        side = 0;
    }

    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return side * side;
    }

    @Override
    public void howToColor()
    {
        System.out.println("Раскрасьте все четыре стороны.");
    }
}
