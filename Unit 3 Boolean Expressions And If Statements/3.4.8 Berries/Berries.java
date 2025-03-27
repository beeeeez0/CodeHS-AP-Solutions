import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry initial
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial of a berry:");
        String iniStr = input.nextLine();

        // To get the input as a character, use the String method
        // charAt().  Use str.charAt(0) since you want the
        // first character
        char initial = iniStr.charAt(0);



        // Now you can compare characters using ==
        if(initial == 'r')
            System.out.println("You ordered raspberry");
        else if(initial == 'h')
            System.out.println("You ordered huckleberry");
        else if(initial == 'g')
            System.out.println("You ordered goji berry");
        else
            System.out.println("Berry not recognized");


        // Use comments to list the different
        // branches you will need before you write the code
    }
}