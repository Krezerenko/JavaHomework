package structs;

import java.util.Arrays;

public class GenericStack<E>
{
    private int capacity;
    private int size;
    private E[] array;

    public GenericStack(int capacity)
    {
        this.capacity = capacity > 0 ? capacity : 1;
        this.size = 0;
        this.array = (E[]) new Object[capacity];
    }

    public GenericStack()
    {
        this.capacity = 10;
        this.size = 0;
        this.array = (E[]) new Object[capacity];
    }

    public int getCapacity()
    {
        return capacity;
    }
    public int getSize()
    {
        return size;
    }

    public E peek()
    {
        return array[size - 1];
    }

    public void push(E o)
    {
        if (size + 1 <= capacity)
        {
            array[size] = o;
            size++;
            return;
        }

        capacity *= 2;
        E[] temp = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++)
        {
            temp[i] = array[i];
        }
        temp[size] = o;
        size++;
        array = temp;
    }

    public E pop()
    {
        if (size == 0) return null;
        size--;
        return array[size];
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public String toString()
    {
        return "стек: " + Arrays.toString(array);
    }
}
