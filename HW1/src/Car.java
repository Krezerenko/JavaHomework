public class Car
{
    private String _model;
    private String _license;
    private String _color;
    private int _year;

    private final int _currentYear = 2024;

    Car(String model, String license, String color, int year)
    {
        _model = model;
        _license = license;
        _color = color;
        _year = year;
    }

    Car(String model, String license, String color)
    {
        _model = model;
        _license = license;
        _color = color;
        _year = 0;
    }

    Car()
    {
        _model = "None";
        _license = "None";
        _color = "Transparent";
        _year = 0;
    }

    public String Model()
    {
        return _model;
    }

    public void SetModel(String model)
    {
        _model = model;
    }

    public String License()
    {
        return _license;
    }

    public void SetLicense(String license)
    {
        _license = license;
    }

    public String Color()
    {
        return _color;
    }

    public void SetColor(String color)
    {
        _color = color;
    }

    public int Year()
    {
        return _year;
    }

    public void SetYear(int year)
    {
        _year = year;
    }

    public int Age()
    {
        return _currentYear - _year;
    }

    public String ToString()
    {
        return _model + " " + _license + " " + _color + " " + _year;
    }
}
