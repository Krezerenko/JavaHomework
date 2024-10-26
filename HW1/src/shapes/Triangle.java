package shapes;

public class Triangle extends GeometricObject
{
    private double side1, side2, side3;

    public Triangle()
    {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
    {
        if (side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2)
            throw new IllegalTriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1()
    {
        return side1;
    }
    public void setSide1(double side1) throws IllegalTriangleException
    {
        if (side1 >= side2 + side3)
            throw new IllegalTriangleException();
        this.side1 = side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public void setSide2(double side2) throws IllegalTriangleException
    {
        if (side2 >= side1 + side3)
            throw new IllegalTriangleException();
        this.side2 = side2;
    }

    public double getSide3()
    {
        return side3;
    }
    public void setSide3(double side3) throws IllegalTriangleException
    {
        if (side3 >= side1 + side2)
            throw new IllegalTriangleException();
        this.side3 = side3;
    }

    public void setAllSides(double side1, double side2, double side3) throws IllegalTriangleException
    {
        if (side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2)
            throw new IllegalTriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    public double getArea()
    {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString()
    {
        return "Треугольник:\nСторона1: " + side1 + "\nСторона2: " + side2 + "\nСторона3: " + side3;
    }

    @Override
    public void howToColor()
    {
        System.out.println("Раскрасьте все три стороны.");
    }
}
