public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater a = new Rater("a", 79);
        a.updateReview();
        System.out.println(a);
        a.setRating(90);
        a.updateReview();
        System.out.println(a);
    }
}