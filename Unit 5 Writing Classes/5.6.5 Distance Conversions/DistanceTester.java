public class DistanceTester
{
    public static void main(String[] args)
    {
        // Create three Distance objects
        Distance a = new Distance(5);
        Distance b = new Distance(10);
        Distance c = new Distance(12);

        // Convert one to yards, one to kilometers,
        // and the last one to feet
        System.out.println(a.toYards());
        System.out.println(b.toKilometers());
        System.out.println(c.toFeet());


        // Print out the converted values

    }
}