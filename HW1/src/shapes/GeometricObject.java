package shapes;

public abstract class GeometricObject implements Comparable<GeometricObject>
{
    protected String color = "белый";
    protected boolean isFilled;
    private final java.util.Date dateCreated;

    public GeometricObject()
    {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean isFilled)
    {
        dateCreated = new java.util.Date();
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean getFilled()
    {
        return isFilled;
    }
    public void setFilled(boolean filled)
    {
        this.isFilled = filled;
    }

    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    public String toString()
    {
        return "создан " + dateCreated + ",\nцвет: " + color +
                ", заливка: " + isFilled;
    }

    public abstract double getArea();

    public static GeometricObject max(GeometricObject o1, GeometricObject o2)
    {
        if (o1.getArea() >= o2.getArea())
        {
            return o1;
        }
        return o2;
    }

    @Override
    public int compareTo(GeometricObject o)
    {
        return (int)(this.getArea() - o.getArea());
    }
}