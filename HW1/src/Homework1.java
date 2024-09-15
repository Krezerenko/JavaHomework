import java.util.Scanner;

public class Homework1 extends TaskContainer
{
    public Homework1(String name)
    {
        super(name);
        _tasks = new Task[]{new Task1("1"), new Task2("2")};
    }

    private static class Task1 extends Task
    {
        public Task1(String name)
        {
            super(name);
        }

        @Override
        public void Execute()
        {
            var input = new Scanner(System.in);

            final double ROUBLES_PER_YUAN = 11.91;
            int yuan;

            do
            {
                System.out.print("Введите юани: ");
                yuan = input.nextInt();
                double roubles = yuan * ROUBLES_PER_YUAN;
                System.out.printf("%.2f", roubles);
                System.out.println(" Рублей");
            } while (yuan != 0);
        }
    }

    private static class Task2 extends Task
    {
        public Task2(String name)
        {
            super(name);
        }

        @Override
        public void Execute()
        {
            final double ROUBLES_PER_YUAN = 11.91;
            int yuan;

            do
            {
                var input = new Scanner(System.in);

                System.out.print("Введите юани: ");
                yuan = input.nextInt();
                {
                    var digit = yuan % 10;
                    String ending1;
                    String ending2;
                    if (digit == 1)
                    {
                        ending1 = "ий";
                        ending2 = "ь";
                    }
                    else if (digit >= 2 && digit <= 4)
                    {
                        ending1 = "их";
                        ending2 = "я";
                    }
                    else
                    {
                        ending1 = "их";
                        ending2 = "ей";
                    }
                    System.out.println(" Китайск" + ending1 + " Юан" + ending2);
                }
                double roubles = yuan * ROUBLES_PER_YUAN;
                System.out.printf("%.2f", roubles);
                System.out.println(" Рублей");
            } while (yuan != 0);
        }
    }
}
