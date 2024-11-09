package structs;

import java.util.ArrayList;

public class GenericStack2<E> extends ArrayList<E>
{
    public E peek()
    {
        return get(size() - 1);
    }

    public void push(E o)
    {
        add(o);
    }

    public E pop()
    {
        E o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public String toString()
    {
        return "стек: " + super.toString();
    }
}
