import java.util.*;
public class Median
{

    public static void main(String[] args)
    {
        // your code goes here!
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Please enter 6 numbers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The median is " + median(arr));

    }

    public static double median(int[] arr)
    {
        // your code goes here!
        Arrays.sort(arr);
        int mid1 = arr.length / 2-1;
        int mid2 = arr.length / 2;
        return (arr[mid1] + arr[mid2]) / 2.0;
    }
}