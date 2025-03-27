import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Your code goes here!
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 10:");
        int num = input.nextInt();
        System.out.println("Multiplication table for " + num + ":");
        for(int i=1; i<=10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }

    }
}