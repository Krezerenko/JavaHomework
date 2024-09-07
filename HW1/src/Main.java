import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        var input = new Scanner(System.in);
        System.out.print("Введите номер подзадания: ");
        int exNum = input.nextInt();

        if (exNum != 1 && exNum != 2)
        {
            System.out.print("Неверный номер подзадания. Завершение работы.");
            return;
        }

        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;

        do
        {
            System.out.print("Введите юани: ");
            yuan = input.nextInt();
            switch (exNum)
            {
                case 1:
                    break;
                case 2:
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
                    break;
            }
            double roubles = yuan * ROUBLES_PER_YUAN;
            System.out.printf("%.2f", roubles);
            System.out.println(" Рублей");
        } while (yuan != 0);
    }
}