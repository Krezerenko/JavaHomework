package gui.mac;

import gui.core.Checkbox;

public class MacCheckbox extends Checkbox
{
    public MacCheckbox(String label)
    {
        super(label);
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Mac checkbox " + label);
    }
}
