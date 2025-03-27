import java.util.Scanner;

public class RollerCoaster
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in inches:");
        int h = input.nextInt();
        System.out.println("Enter your weight in pounds:");
        int w = input.nextInt();

        if(h>=42 && w < 300) {
            System.out.println("Welcome aboard!");
        } else {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}