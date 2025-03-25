import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = input.nextLine();
        Bot hal = new Bot(name);
        hal.greeting();
        hal.help();
        System.out.println("What's the weather like?");
        hal.weather();
        System.out.println("How many feet in a mile?");
        hal.feetInMile();
        hal.goodbye();


    }
}