public class Pizza
{
    // Add the instance variables here
    private int size;
    private int numToppings;
    private String toppings;



    // Put the constructor here
    public Pizza(int _size, int _numToppings, String _toppings) {
        size = _size;
        numToppings = _numToppings;
        toppings = _toppings;
    }


    // You don't need to do anything with this method
    // Used to print the object
    public String toString()
    {
        return size + " inch pizza with " + numToppings + " toppings: " + toppings;
    }
}