import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Ask the user for a number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        // Call the makeMultiplicationTable method
        makeMultiplicationTable(num);
    }

    // Makes a multiplcation table
    public static void makeMultiplicationTable(int size)
    {
        // Your code goes here!!!
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                System.out.print(j*i + "\t");
            }
            System.out.println("");
        }
    }
}