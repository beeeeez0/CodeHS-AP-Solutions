public class ArrayAverageTester
{

    public static void main(String[] args)
    {
        int[] numArray =  {12, 17, 65, 7, 30, 88};

        // Create an ArrayAverage object and print the result
        ArrayAverage a = new ArrayAverage(numArray);
        System.out.println("The average of the array is " + a.getAverage());
    }
}