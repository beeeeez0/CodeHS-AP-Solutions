public class ConstructionJob
{

    private double lumberCost;  // price per board
    private int lumberQuant; // number of boards
    private double taxRate;


    public ConstructionJob(double cost, int quantity, double taxes)
    {
        lumberCost = cost;
        lumberQuant = quantity;
        taxRate = taxes;
    }

    // Computes and returns the cost
    // of the lumber
    public double total()
    {
        return lumberCost * lumberQuant;
    }

    // Computes the grand total by adding
    // the tax amount to the total
    public double grandTotal()
    {
        return total() * (1 + taxRate);
    }

}