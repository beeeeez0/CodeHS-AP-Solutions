import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

        //Start Here!
        Scanner input = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        String name = input.nextLine();

        Bot2 a = new Bot2(name);
        a.greeting();
        System.out.println("What is your favorite animal?");
        String animal = input.nextLine();
        System.out.println();
        a.favoriteAnimal(animal);
        System.out.println("Where do you live?");
        String loc = input.nextLine();
        a.home(loc);
        System.out.println("What is your favorite number?");
        int num = input.nextInt();
        a.favoriteNumber(num);
        a.goodbye();
    }
}