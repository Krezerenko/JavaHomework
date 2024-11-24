package gui.mac;

import gui.core.Button;
import gui.core.Checkbox;
import gui.core.GUIFactory;

public class MacGUIFactory implements GUIFactory
{
    @Override
    public Button createButton(String label)
    {
        return new MacButton(label);
    }

    @Override
    public Checkbox createCheckbox(String label)
    {
        return new MacCheckbox(label);
    }
}
