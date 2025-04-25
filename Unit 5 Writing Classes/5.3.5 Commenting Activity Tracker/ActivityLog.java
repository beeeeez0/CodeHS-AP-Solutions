public class ActivityLog
{
    private double numHours;
    private double numMiles;

    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }

    // Increases numHours by the amount of hours put
    public void addHours(double hours)
    {
        numHours += hours;
    }

    // Increases numMiles by the amount of miles put
    public void addMiles(double miles)
    {
        numMiles += miles;
    }

    // Returns numMiles
    public double getMiles()
    {
        return numMiles;
    }

    // Returns numHours
    public double getHours()
    {
        return numHours;
    }

}