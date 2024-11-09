package homeworks;

import core.Task;
import core.TaskContainer;
import shapes.ComparableCircle;
import structs.GenericStack;
import structs.GenericStack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework9 extends TaskContainer
{
    public Homework9(String name)
    {
        super(name);
        tasks = new Task[] { new Task1_1("1.1"), new Task1_2("1.2"), new Task1_3("1.3"), new Task1_4("1.4"), new Task2_1("2.1"), new Task2_2("2.2") };
    }

    private static class Task1_1 extends Task
    {
        public Task1_1(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите количество элементов массива: ");
            int len = input.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i < len; i++)
            {
                array.add(input.nextInt());
            }
            ArrayList<Integer> unique = uniqueArray(array);
            System.out.println("Список без дубликатов: " + unique);
        }

        private static <T> ArrayList<T> uniqueArray(ArrayList<T> array)
        {
            ArrayList<T> out = new ArrayList<T>();
            for (T el : array)
            {
                if (out.contains(el)) continue;
                out.add(el);
            }
            return out;
        }
    }

    private static class Task1_2 extends Task
    {
        public Task1_2(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите количество элементов массива: ");
            int len = input.nextInt();
            Integer[] array = new Integer[len];
            for (int i = 0; i < len; i++)
            {
                array[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(array));
            System.out.print("Введите элемент для поиска: ");
            int element = input.nextInt();
            int index = linearSearch(array, element);
            System.out.println("Индекс найденного элемента: " + index);
        }

        private static <T> int linearSearch(T[] array, T value)
        {
            int i = 0;
            for (int j = 0; j < array.length; j++)
            {
                if (array[i].equals(value)) return i;
                i++;
            }
            return -1;
        }
    }

    private static class Task1_3 extends Task
    {
        public Task1_3(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите количество кругов: ");
            int len = input.nextInt();
            ComparableCircle[] array = new ComparableCircle[len];
            for (int i = 0; i < len; i++)
            {
                System.out.print("Введите радиус круга: ");
                array[i] = new ComparableCircle(input.nextDouble());
            }
            for (int i = 0; i < len; i++)
            {
                System.out.print(array[i].getRadius() + " ");
            }
            System.out.println();
            System.out.println("Максимальный круг:");
            ComparableCircle max = max(array);
            if (max == null)
            {
                System.out.println("Список пуст.");
                return;
            }
            System.out.println("Радиус максимального круга: " + max.getRadius());
        }

        private static ComparableCircle max(ComparableCircle[] array)
        {
            if (array.length == 0) return null;
            ComparableCircle maxCircle = array[0];
            for (ComparableCircle el : array)
            {
                if (el.compareTo(maxCircle) > 0) maxCircle = el;
            }
            return maxCircle;
        }
    }

    private static class Task1_4 extends Task
    {
        public Task1_4(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите количество строк матрицы: ");
            int len1 = input.nextInt();
            System.out.print("Введите количество столбцов матрицы: ");
            int len2 = input.nextInt();
            Integer[][] matrix = new Integer[len1][len2];
            for (int i = 0; i < len1; i++)
            {
                for (int j = 0; j < len2; j++)
                {
                    matrix[i][j] = input.nextInt();
                }
            }
            for (Integer[] array : matrix)
            {
                System.out.println(Arrays.toString(array));
            }
            Integer max = matrixMax(matrix);
            if (max == null)
            {
                System.out.println("Матрица пуста.");
                return;
            }
            System.out.println("Максимальный элемент: " + max);
        }

        private static <T extends Comparable<? super T>> T matrixMax(T[][] matrix)
        {
            if (matrix.length == 0) return null;
            if (matrix[0].length == 0) return null;
            T max = matrix[0][0];
            for (T[] array : matrix)
            {
                for (T el : array)
                {
                    if (el.compareTo(max) > 0) max = el;
                }
            }
            return max;
        }
    }

    private static class Task2_1 extends Task
    {
        public Task2_1(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите количество элементов стека: ");
            int len = input.nextInt();
            GenericStack<String> stack = new GenericStack<String>();
            for (int i = 0; i < len; i++)
            {
                stack.push(input.nextLine());
            }
            System.out.print("Элементы стека в обратном порядке: ");
            while (!stack.isEmpty())
            {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }

    private static class Task2_2 extends Task
    {
        public Task2_2(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите количество элементов стека: ");
            int len = input.nextInt();
            GenericStack2<String> stack = new GenericStack2<String>();
            for (int i = 0; i < len; i++)
            {
                stack.push(input.nextLine());
            }
            System.out.print("Элементы стека в обратном порядке: ");
            while (!stack.isEmpty())
            {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }
}
