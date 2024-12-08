package iterator;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ArrayWithIterator<T>
{
    private T[] array;

    public ArrayWithIterator(int size)
    {
        array = (T[]) Array.newInstance(Object.class, size);
    }
    public ArrayWithIterator(T[] array)
    {
        this.array = array;
    }
    public MyIterator getIterator()
    {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<T>
    {
        int index = 0;
        @Override
        public boolean hasNext()
        {
            return index < array.length;
        }

        @Override
        public T next()
        {
            return array[index++];
        }
    }
}
