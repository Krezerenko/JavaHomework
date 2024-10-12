package bikeproject;

public class Bike implements BikeParts, IBeepin
{
    private String handleBars, frame, tyres, seatType;
    private int NumGears;
//    public final String make;

    public Bike()
    {
//        this.make = "Oracle Cycles";
    }

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears)
    {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        NumGears = numGears;
//        this.make = "Oracle Cycles";
    }

    protected void printDescription()
    {
        System.out.println("\n" + BikeParts.make + "\n"
                + "This bike has " + this.handleBars + " handlebars on a "
                + this.frame + " frame with " + this.NumGears + " gears."
                + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
    }

	@Override
	public void startBiking()
	{
		System.out.println("Biking initiated.");
	}

	@Override
	public void beep()
	{
		System.out.println("Beep!!");
	}
}

