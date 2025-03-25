import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double: ");
        int myDouble = (int) input.nextDouble();
        System.out.println(myDouble);

    }
}