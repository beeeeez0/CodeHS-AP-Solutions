public class PinataTester
{
    public static void main(String[] args)
    {
        // Make Pinatas!
        Pinata ella = new Pinata();
        Pinata pete = new Pinata("chocolate", 12, "star");
        Pinata sweetie = new Pinata(16);

        // Print the pinatas
        System.out.println(ella);
        System.out.println(pete);
        System.out.println(sweetie);

    }
}