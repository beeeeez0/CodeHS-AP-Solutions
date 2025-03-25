public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website example = new Website();
        Website goodSchool = new Website("goodSchool", "edu", 0);
        Website codeHS = new Website("codehs", "com", 1000000);
        System.out.println(example);
        System.out.println(goodSchool);
        System.out.println(codeHS);
    }
}