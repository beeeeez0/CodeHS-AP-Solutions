public class RandomizerTester
{
    public static void main(String[] args)
    {

        System.out.println("Results of Randomizer.nextDouble()");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Randomizer.nextDouble());
        }

        //Initialize min and max for Randomizer.nextInt(min,max)
        double min = 5.5;
        double max = 10.2;
        System.out.println("\nResults of Randomizer.nextDouble(5.5,10.2)");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Randomizer.nextDouble(min ,max));
        }

    }
}