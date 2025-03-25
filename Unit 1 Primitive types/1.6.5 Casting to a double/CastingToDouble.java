import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first integer: ");
        int int1 = input.nextInt();
        System.out.println("Enter your second integer: ");
        int int2 = input.nextInt();
        int sumInt = int1/int2;
        double sumDouble = (double) int1/(double)int2;
        System.out.println("Integer Division: "+sumInt);
        System.out.println("Double Division: "+sumDouble);

    }
}