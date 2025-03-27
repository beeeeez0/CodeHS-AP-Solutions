public class RaceCar
{
    private String name; // name of driver
    private double accel; // acceleration

    public RaceCar(String driver, double acceleration)
    {
        name = driver;
        accel = acceleration;
    }

    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double time = Math.sqrt(2*distance/accel);
        return (Math.round(time*100.0))/100.0;
    }

    public String toString()
    {
        return "Racer " + name;
    }
}