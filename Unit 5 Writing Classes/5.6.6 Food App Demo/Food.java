public class Food
{
    //Declare instance variables
    private String name;
    private double cost;


    //Create Food Constructor
    public Food(String _name, double _cost) {
        name = _name;
        cost = _cost;
    }


    //Add getter and setter methods for cost
    public double getCost() {
        return cost;
    }
    public void setCost(double newCost) {
        cost = newCost;
    }

    //Add getter and setter methods for name

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }


    //Add toString method
    public String toString() {
        return name + " cost $" + cost;
    }

}