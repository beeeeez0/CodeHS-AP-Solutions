import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        Hello hi = new Hello("Jason Jackson the third");

        hi.spanish();
        hi.french();
        hi.german();

    }
}