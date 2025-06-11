public class Randomizer
{
    public static double nextDouble()
    {
        //Implement this method to return a random double from 0-10
        return Math.random() * 10.0;
    }

    public static double nextDouble(double min, double max)
    {
        //Implement this method to return a random double between min and max
        return Math.random() * (max-min) + min;
    }
}