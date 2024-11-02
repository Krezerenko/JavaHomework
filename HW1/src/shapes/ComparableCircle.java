package shapes;

import java.awt.*;

public class ComparableCircle extends Circle
{
    public ComparableCircle(double radius)
    {
        super(radius);
    }

    public ComparableCircle()
    {
        super();
    }
    @Override
    public int compareTo(GeometricObject o)
    {
        return (int)Math.signum(this.getDiameter() - ((ComparableCircle)o).getDiameter());
    }

    public static ComparableCircle max(ComparableCircle circ1, ComparableCircle circ2)
    {
        if (circ1.compareTo(circ2) > 0)
        {
            return circ1;
        }
        return circ2;
    }
}
