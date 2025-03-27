import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
        System.out.println("What do you want to drink?");
        String drink = input.nextLine();
        System.out.println("Do you want sugar with that (true or false)?");
        boolean sugar = input.nextBoolean();

        if(sugar == true) {
            System.out.println("Confirming your order. You wanted:\n" + drink + " with sugar");
        } else if (sugar == false) {
            System.out.println("Confirming your order. You wanted:\n" + drink);
        }

    }
}