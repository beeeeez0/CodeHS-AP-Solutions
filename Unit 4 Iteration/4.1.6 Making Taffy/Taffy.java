import java.util.Scanner;
public class Taffy
{
    public static void main(String[] args)
    {

        // Your code starts here
        Scanner input = new Scanner(System.in);
        System.out.println("Starting Taffy timer...");
        while(true) {
            int t = 0;

            System.out.print("Enter the temperature: ");
            t = input.nextInt();
            if(t < 130) {
                System.out.println("\nThe mixture isn't ready yet");
            } else {
                break;
            }
        }
        System.out.println("Your taffy is ready for the next step!");

    }
}