package gui.win;

import gui.core.Button;

public class WinButton extends Button
{
    public WinButton(String label)
    {
        super(label);
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Windows button " + label);
    }
}
