package gui.core;

public abstract class Button
{
    protected String label;

    public Button(String label)
    {
        this.label = label;
    }

    public String getLabel()
    {
        return label;
    }
    public abstract void draw();
}
