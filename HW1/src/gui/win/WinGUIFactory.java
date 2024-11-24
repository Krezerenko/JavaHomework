package gui.win;

import gui.core.Button;
import gui.core.Checkbox;
import gui.core.GUIFactory;

public class WinGUIFactory implements GUIFactory
{
    @Override
    public Button createButton(String label)
    {
        return new WinButton(label);
    }

    @Override
    public Checkbox createCheckbox(String label)
    {
        return new WinCheckbox(label);
    }
}
