public class Extremes
{
    Integer min;
    Integer max;

    // Constructor
    public Extremes()
    {
        //Set min and max values
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
    }

    // Returns the difference
    // max - number
    public Integer maxDiff(Integer number)
    {
        return Integer.MAX_VALUE - number;
    }

    // Returns the difference
    // min - number
    public Integer minDiff(Integer number)
    {
        return Integer.MIN_VALUE - number;
    }

    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";
    }
}