package gui.win;

import gui.core.Checkbox;

public class WinCheckbox extends Checkbox
{
    public WinCheckbox(String label)
    {
        super(label);
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Windows checkbox " + label);
    }
}
