package homeworks;

import core.Task;
import gui.core.GUIFactory;
import gui.core.Button;
import gui.core.Checkbox;
import gui.mac.MacGUIFactory;
import gui.win.WinGUIFactory;

import java.util.Scanner;

public class Homework12 extends Task
{
    public Homework12(String name)
    {
        super(name);
    }

    @Override
    public void execute()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите операционную систему: ");
        String os = input.nextLine();
        GUIFactory gui;
        if (os.equalsIgnoreCase("windows"))
        {
            gui = new WinGUIFactory();
        }
        else if (os.equalsIgnoreCase("mac"))
        {
            gui = new MacGUIFactory();
        }
        else
        {
            System.out.println("Данная операционная система не реализована.");
            return;
        }
        Button button;
        Checkbox checkbox;
        System.out.print("Введите метку кнопки: ");
        button = gui.createButton(input.nextLine());
        System.out.print("Введите метку чекбокса: ");
        checkbox = gui.createCheckbox(input.nextLine());
        button.draw();
        checkbox.draw();
    }
}
