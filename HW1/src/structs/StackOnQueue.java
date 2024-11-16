package structs;

import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue<E>
{
    Queue<E> inpQueue;
    Queue<E> outQueue;

    public StackOnQueue()
    {
        inpQueue = new LinkedList<E>();
        outQueue = new LinkedList<E>();
    }

    public void push(E x)
    {
        while (!outQueue.isEmpty())
        {
            inpQueue.add(outQueue.remove());
        }
        inpQueue.add(x);
        while (!inpQueue.isEmpty())
        {
            outQueue.add(inpQueue.remove());
        }
    }

    public E pop()
    {
        return outQueue.remove();
    }

    public E top()
    {
        return outQueue.peek();
    }

    public Boolean isEmpty()
    {
        return outQueue.isEmpty();
    }

    @Override
    public String toString()
    {
        StringBuilder out = new StringBuilder();
        for (E x : outQueue)
        {
            out.append(x).append(" ");
        }
        return out.toString();
    }
}
