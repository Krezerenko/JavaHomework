package flyweight;

import java.util.HashMap;

public class CircleFabric
{
    private HashMap<String, Circle> circles;

    public CircleFabric()
    {
        circles = new HashMap<>();
    }

    public Circle getCircle(String color)
    {
        if (!circles.containsKey(color))
        {
            circles.put(color, new ConcreteCircle(color));
            System.out.println("Создание круга с цветом " + color);
        }
        return circles.get(color);
    }
}
