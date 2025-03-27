import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask for a word
        System.out.println("Enter a random word: ");
        String randWord  = input.nextLine();
        WordGames rw = new WordGames(randWord);
        // Scramble it
        // Print out scrambled word
        System.out.println(rw.scramble());

        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();

        // Add random word at index
        // Print out the word
        System.out.println(rw.bananaSplit(idx, word));


        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        System.out.println("Enter a character: ");
        String c = input.nextLine();
        System.out.println("Enter another random word: ");
        String nrw = input.nextLine();
        System.out.println(rw.bananaSplit(c, nrw));


    }
}