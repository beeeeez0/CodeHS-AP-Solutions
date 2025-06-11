public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        int[] scores = {80, 90, 84, 65, 88};

        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);

        }

        System.out.println();
        scores[1] = 88;
        scores[3] = 76;

        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}