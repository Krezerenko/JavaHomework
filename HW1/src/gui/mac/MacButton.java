package gui.mac;

import gui.core.Button;

public class MacButton extends Button
{
    public MacButton(String label)
    {
        super(label);
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Mac button " + label);
    }
}
