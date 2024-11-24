package gui.core;

public abstract class Checkbox
{
    protected String label;
    protected boolean checked;

    public Checkbox(String label)
    {
        this.label = label;
    }

    public String getLabel()
    {
        return label;
    }
    public boolean isChecked()
    {
        return checked;
    }
    public abstract void draw();
}
