import java.util.Scanner;

public class OrderUp
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Display menu
        String menu = "101. Hamburger\n102. Cheeseburger\n103. Veggie Burger\n201. Nachos\n301. Hot Dog\n";

        System.out.println(menu);

        // Get customer order
        System.out.println("Enter label: ");
        String customerOrder = input.nextLine();

        // Use substring to get the first three characters (the number)
        String combo = customerOrder.substring(0, 3);


        // Create an Integer object by using the static
        // method Integer.valueOf(someString)
        // to turn the string into an Integer

        Integer comboNumber =  Integer.valueOf(combo);

        // Print out what the customer ordered
        System.out.println("Customer ordered number " + comboNumber);


    }
}