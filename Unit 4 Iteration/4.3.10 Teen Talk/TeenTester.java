import java.util.Scanner;

public class TeenTester
{
    public static void main(String[] args)
    {
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10);
        System.out.println(myFriend);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text message being sent:");
        String text = input.nextLine();

        System.out.println(myFriend.teenTalk(text));

    }
}