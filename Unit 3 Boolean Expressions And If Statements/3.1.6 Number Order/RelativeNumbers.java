import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        // Ask for two numbers
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        boolean test1 = int1 < int2;
        boolean test2 = int1 == int2;
        boolean test3 = int1 > int2;
        System.out.println(int1 + " < " + int2 + ": " + test1);
        System.out.println(int1 + " == " + int2 + ": " + test2);
        System.out.println(int1 + " > " + int2 + ": " + test3);


        // Compare the numbers as instructed

        // Display the results
    }
}