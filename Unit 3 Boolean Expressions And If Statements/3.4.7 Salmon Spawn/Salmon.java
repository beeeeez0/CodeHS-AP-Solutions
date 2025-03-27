import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask user for month of year as an integer
        System.out.println("Enter a month of the year as an integer:");
        int month = input.nextInt();

        // Use if/else if/else statement to determine if it is spawning season
        if(month >= 4 && month <= 6) {
            System.out.println("It is Spring spawning season");
        } else if(month >= 10 && month <= 12) {
            System.out.println("Fall spawning season");
        } else {
            System.out.println("Not spawning season");
        }
    }
}