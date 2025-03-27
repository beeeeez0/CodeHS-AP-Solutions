import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // Ask the user for three strings.
        // Use a Boolean variable to test the comparison of
        // first+second equals third
        // Remember since you are working with strings to
        // use equals() and NOT == !
        Scanner input = new Scanner(System.in);
        System.out.print("First string? ");
        String s1 = input.nextLine();
        System.out.print("Second string? ");
        String s2 = input.nextLine();
        System.out.print("Third string? ");
        String s3 = input.nextLine();
        String s4 = s1 + s2;
        if(s4.equals(s3))
        {
            System.out.println(s1 + " + " + s2 + " is equal to " + s3 + "!");
        }
        else
        {
            System.out.println(s1 + " + " + s2 + " is not equal to " + s3 + "!");
        }
    }
}