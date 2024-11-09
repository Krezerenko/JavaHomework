package structs;

import java.util.ArrayList;

public class MyStack<E> implements Cloneable
{
    private ArrayList<E> list;

    public MyStack()
    {
        list = new ArrayList<E>();
    }

    public boolean IsEmpty()
    {
        return list.isEmpty();
    }
    public int getSize()
    {
        return list.size();
    }
    public E peek()
    {
        return list.getFirst();
    }
    public E pop()
    {
        return list.removeFirst();
    }
    public void push(E o)
    {
        list.addFirst(o);
    }

    @Override
    public MyStack<E> clone()
    {
        try
        {
            MyStack<E> clone = (MyStack<E>) super.clone();
            clone.list = new ArrayList<E>();

            for (E o : list.reversed())
                clone.push(o);
            return clone;
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    @Override
    public String toString()
    {
        return list.toString();
    }
}
