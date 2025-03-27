import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        Scanner input = new Scanner(System.in);
        // It is useful to plan out your steps before you get started!
        System.out.println("Enter a number (-1 to quit): ");

        int num = input.nextInt();
        int currentMin = num;
        int currentMax = num;
        while(num!=-1) {
            if (num < currentMin) {
                currentMin = num;
            } else if (num > currentMax) {
                currentMax = num;
            }
            System.out.println("Smallest # so far: " + currentMin);
            System.out.println("Largest # so far: " + currentMax);
            System.out.println("Enter a number (-1 to quit): ");
            num = input.nextInt();
        }

    }
}