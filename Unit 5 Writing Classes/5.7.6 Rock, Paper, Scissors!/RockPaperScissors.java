import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    public static String getWinner(String user, String computer)
    {
        if(user.equals(computer)) {
            return TIE;
        } else if (user.equals("rock") && computer.equals("scissors")) {
            return USER_PLAYER;
        } else if(user.equals("paper") && computer.equals("rock")) {
            return USER_PLAYER;
        } else if(user.equals("scissors") && computer.equals("paper")) {
            return USER_PLAYER;
        } else {
            return COMPUTER_PLAYER;
        }

    }

    public static void main(String[] args)
    {
        String[] options = {"rock", "paper", "scissors"};
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String userOption = input.nextLine();
            String computerOption = options[Randomizer.nextInt(0, 3)];
            if(userOption.equals("")) {
                System.out.println("Thanks for playing!");
                break;
            } else {
                System.out.println("User: " + userOption);
                System.out.println("Computer: " + computerOption);
                System.out.println(getWinner(userOption.toLowerCase(), computerOption));
            }


        }


    }
}