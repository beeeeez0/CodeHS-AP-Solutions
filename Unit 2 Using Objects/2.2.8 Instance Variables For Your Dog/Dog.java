public class Dog
{
    private String breed;
    // Add an instance variable here for name.
    private String name;

    public Dog(String theBreed, String _name)
    {
        breed = theBreed;
        name = _name;
    }

    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + breed;
    }
}