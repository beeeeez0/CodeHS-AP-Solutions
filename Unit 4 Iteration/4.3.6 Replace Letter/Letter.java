import java.util.Scanner;
public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.nextLine();
        System.out.println("\nEnter the letter you want to replace:");
        String l1 = input.nextLine();
        System.out.println("\nEnter the replacing letter:");
        String l2 = input.nextLine();
        System.out.println(replaceLetter(word, l1, l2));


        // Call the method replaceLetter and pass all 3 of these items to it for
        // string processing.
    }

    // Modify this method so that it will take a third parameter from a user that is the String they want to
    //to replace letterToReplace with. This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String replacingLetter)
    {
        String newWord = "";
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            String currentLetter = word.substring(i, i+1);
            if(currentLetter.equals(letterToReplace))
            {
                newWord += replacingLetter;
            } else {
                newWord += currentLetter;
            }
        }
        return newWord;
    }
}