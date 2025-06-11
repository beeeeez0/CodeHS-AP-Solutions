public class FirstArray
{
    public static void main(String[] args)
    {
        // Create the 3 arrays here
        String[] a = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] b = {104, 73, 80};
        double[] c = {4.17, 26.7, 55.0};

        // Print all 3 arrays according to the output in the description


        System.out.println(a[0] + " has an average annual precipitation of " + c[0] + " inches.");
        System.out.println(a[0] + " has an average annual high temp of " + b[0] + " degrees Fahrenheit.");

        System.out.println(a[1] + " has an average annual precipitation of " + c[1] + " inches.");
        System.out.println(a[1] + " has an average annual high temp of " + b[1] + " degrees Fahrenheit.");

        System.out.println(a[2] + " has an average annual precipitation of " + c[2] + " inches.");
        System.out.println(a[2] + " has an average annual high temp of " + b[2] + " degrees Fahrenheit.");

    }
}