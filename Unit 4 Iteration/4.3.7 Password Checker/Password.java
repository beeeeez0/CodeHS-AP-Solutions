import java.util.Scanner;
public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        // In not valid, reprompt the user
        Scanner input = new Scanner(System.in);
        int i = -1;
        while(i < 0) {
            System.out.println("Enter your password:");
            String pass = input.nextLine();
            if(passwordCheck(pass)) {
                i = 1;
            } else {
                ;

            }
            System.out.println(passwordCheck(pass));
        }


    }

    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters
        // and numbers.
        boolean length = false;
        boolean letter = false;

        if(password.length() >= 8) {
            length = true;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if(Character.isLetterOrDigit(c) && !password.contains(" ")) {
                    letter = true;
                } else{
                    letter = false;
                }
            }
        } else {
            length = false;
            letter = false;
        }

        boolean eval = (letter && length);
        return eval;



    }
}