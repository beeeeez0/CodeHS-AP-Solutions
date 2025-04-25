public class ActivityLog
{
    private double numHours;
    private double numMiles;

    /*
     * Constructor class for activity log,
     * initializes numHours to 0 and numMiles to 0
     */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }

    /*
     * Adds hours to the variable numHours
     * @param hours The hours to add
     */
    public void addHours(double hours)
    {
        numHours += hours;
    }

    /*
     * Adds miles to the variable numMiles
     * @param miles The miles to add
     */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }

    /*
     * Returns the number of miles
     * @return numMiles Returns the number of miles
     */
    public double getMiles()
    {
        return numMiles;
    }

    /*
     * Returns the number of hours
     * @return numHours Returns the number of hours
     */
    public double getHours()
    {
        return numHours;
    }

}