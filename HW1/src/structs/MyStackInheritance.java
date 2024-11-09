package structs;

import java.util.ArrayList;

public class MyStackInheritance<E> extends ArrayList<E>
{
    public boolean IsEmpty()
    {
        return isEmpty();
    }
    public int getSize()
    {
        return size();
    }
    public E peek()
    {
        return getFirst();
    }
    public E pop()
    {
        return removeFirst();
    }
    public void push(E o)
    {
        addFirst(o);
    }
}
