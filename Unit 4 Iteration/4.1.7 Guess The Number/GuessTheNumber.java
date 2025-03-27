import java.util.Scanner;
public class GuessTheNumber
{
    // This is the secret number that will pass the autograder!
    static int secretNumber = 6;
    public static void main(String[] args)
    {

        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("See if you can guess the number!");

        // This calls the static method GuessMyNumber. Notice that the method is outside
        // of the main method.
        guessMyNumber(input);

    }

    public static void guessMyNumber(Scanner input)
    {
        // Your code goes here!
        while(true) {
            System.out.println("Enter your guess:");
            int guess = input.nextInt();
            if(guess==secretNumber) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}