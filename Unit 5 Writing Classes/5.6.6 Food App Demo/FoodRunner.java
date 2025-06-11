import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        Food burger = new Food("Burger", 2.5);
        Food fries = new Food("Fries", 1.39);
        Food cola = new Food("Cola", 0.99);

        System.out.println(burger);
        System.out.println("How many would you like?");
        double a = input.nextInt();
        System.out.println();

        System.out.println(fries);
        System.out.println("How many would you like?");
        double b = input.nextInt();
        System.out.println();
        System.out.println(cola);
        System.out.println("How many would you like?");
        double c = input.nextInt();

        double aCost = a*burger.getCost();
        double bCost = b*fries.getCost();
        double cCost = c*cola.getCost();
        double total = aCost+bCost+cCost;
        System.out.print("\nYour meal will have a total cost of $" + total);
    }
}