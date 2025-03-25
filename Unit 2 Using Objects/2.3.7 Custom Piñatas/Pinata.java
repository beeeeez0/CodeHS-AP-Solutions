public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private int size;
    private String shape;

    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        size = 24;
        shape = "donkey";
    }

    public Pinata(String candyType, int pinataSize, String pinataShape) {
        candy = candyType;
        size = pinataSize;
        shape = pinataShape;
    }

    public Pinata(int pinataSize, String pinataShape) {
        size = pinataSize;
        shape = pinataShape;
        candy = "hard candy";
    }

    public Pinata(int pinataSize) {
        size = pinataSize;
        candy = "hard candy";
        shape = "donkey";
    }

    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables

    // Add an overloaded constructor that allows the user
    // to customize the size and shape

    // Add an overloaded constructor that allows the user
    // to customize the size


    public String toString()
    {
        return size + " inch " + shape + " pinata filled with " + candy;
    }
}