import java.util.Scanner;

public class NumberTriangle
{
    public static void main(String[] args)
    {
        // Ask the user for a number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        // Call the makeNumberTriangle method
        makeNumberTriangle(num);

    }

    // Makes an upright triangle with numbers from 1 to size
    public static void makeNumberTriangle(int size)
    {
        for(int i = 1;i <= size ; i++)
        {
            // We can manipulate the boolean condition to change each iteration
            //In this case, each time the outer loop iterates, j < 7 - i decreases by one
            for(int j = 1;j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}