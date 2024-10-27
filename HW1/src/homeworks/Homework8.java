package homeworks;

import core.Task;
import core.TaskContainer;
import loan.Loan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework8 extends TaskContainer
{
    private static final String[] months = new String[]{ "Январь", "Февраль", "Март", "Апрель", "Май",
            "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь" };
    private static final int[] days = new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Homework8(String name)
    {
        super(name);
        tasks = new Task[]{ new Task1("1"), new Task2("2"), new Task3("3") };
    }

    public static class Task1 extends Task
    {
        public Task1(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            System.out.print("Введите номер месяца: ");
            Scanner input = new Scanner(System.in);
            while(true)
            {
                try
                {
                    int monthNumber = input.nextInt();
                    System.out.println(months[monthNumber - 1] + " имеет " + days[monthNumber - 1] + " дней");
                    break;
                }
                catch(InputMismatchException e)
                {
                    System.out.print("Неправильный ввод! Введите целое число: ");
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.print("Неправильный номер месяца! Введите номер месяца от 1 до 12: ");
                }
            }
        }
    }

    public static class Task2 extends Task
    {
        public Task2(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            System.out.println("Введите годовую процентную ставку, количество лет и сумму кредита:");
            Scanner input = new Scanner(System.in);
            while (true)
            {
                try
                {
                    double annualInterestRate = input.nextDouble();
                    int numberOfYears = input.nextInt();
                    double loanAmount = input.nextDouble();
                    Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
                    break;
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Неправильный ввод! Повторите ввод:");
                    input.nextLine();
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println("Неправильные параметры кредита! Повторите ввод:");
                }
            }
        }
    }

    public static class Task3 extends Task
    {
        public Task3(String name)
        {
            super(name);
        }

        @Override
        public void execute()
        {
            System.out.print("Введите номер месяца: ");
            Scanner input = new Scanner(System.in);
            int monthNumber;
            int daysAmount;
            while(true)
            {
                try
                {
                    monthNumber = input.nextInt();
                    daysAmount = days[monthNumber - 1];
                    break;
                }
                catch(InputMismatchException e)
                {
                    System.out.print("Неправильный ввод! Введите целое число: ");
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.print("Неправильный номер месяца! Введите номер месяца от 1 до 12: ");
                }
            }

            if (monthNumber == 2)
            {
                System.out.print("Введите год: ");
                int year;
                while (true)
                {
                    try
                    {
                        year = input.nextInt();
                        if (isLeapYear(year))
                        {
                            daysAmount = 29;
                        }
                        break;
                    } catch (InputMismatchException e)
                    {
                        System.out.print("Неправильный ввод! Введите целое число: ");
                    }
                }
            }

            System.out.println(months[monthNumber - 1] + " имеет " + daysAmount + " дней");
        }

        public static boolean isLeapYear(int year)
        {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
    }
}
