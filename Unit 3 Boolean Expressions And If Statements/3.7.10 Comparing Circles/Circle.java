public class Circle
{
    private int radius;
    private int x;
    private int y;

    public Circle(int theRadius, int xPosition, int yPosition)
    {
        radius = theRadius;
        x = xPosition;
        y = yPosition;
    }

    public int getRadius()
    {
        return radius;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }


    // Implement a toString method and an equals method here!
    public String toString()
    {
        // Change this!
        return "circle with a radius of " + radius + " at position " + "(" + x + ", " + y + ")";
    }

    public boolean equals(Circle other)
    {

        return (x == other.getX() && y == other.getY() && radius == other.getRadius());
    }
}