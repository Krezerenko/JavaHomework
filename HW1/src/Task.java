public abstract class Task implements IExecutable
{
    public Task(String name)
    {
        _name = name;
    }
    private final String _name;
    public String Name() { return _name; }

    @Override
    public void ExecuteFormatted()
    {
        System.out.println("Задание " + _name);
        Execute();
    }
}
