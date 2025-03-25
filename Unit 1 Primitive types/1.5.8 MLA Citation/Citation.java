import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String book = input.nextLine();
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String author = input.nextLine();
        System.out.println("Enter the publisher of the book: ");
        String publisher = input.nextLine();
        System.out.println("Enter the year the book was published: ");
        int year = input.nextInt();
        System.out.println(author + ". " + book + ".");
        System.out.println(publisher + ", " + year + ". ");
    }
}