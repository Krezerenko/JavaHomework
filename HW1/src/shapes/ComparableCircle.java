package shapes;

public class ComparableCircle extends Circle
{
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
