public class LargestValue
{
    public static void main(String[] arg)
    {
        {
            int[] values = {32, 56, 79, 2, 150, 37};

            int highestValue = findMax(values);
            System.out.println("The highest score is " + highestValue);
        }
    }
    public static int findMax(int[] numbers)
    {
        int maxSoFar = numbers[0];

        int i = 0;
        for(int num : numbers) {
            if(num > maxSoFar) {
                maxSoFar = num;
            }
            i++;
        }

        return maxSoFar;
    }
}