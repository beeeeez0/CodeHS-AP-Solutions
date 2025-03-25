public class Pyramid
{
    public static void main(String[] args)
    {
        int numLarge = 200000;
        int weightLarge = 10;
        int numSmall = 2300000;
        double weightSmall = 1.3;
        double weight1 = (double) numLarge * weightLarge;
        double weight2 = (double) numSmall * weightSmall;
        System.out.print("The pyramid weighs ");
        System.out.print(weight1+weight2 + " tons");

    }
}