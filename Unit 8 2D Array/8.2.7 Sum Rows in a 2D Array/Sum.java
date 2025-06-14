public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{32, 4, 14, 65, 23, 6},
                {4, 2, 53, 31, 765, 34},
                {64235, 23, 522, 124, 42, 64}};

        for(int i = 0; i < array.length; i++) {
            System.out.println(sumRow(array, i));
        }

    }

    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        for(int c = 0; c < array[row].length; c++) {
            sum += array[row][c];
        }

        return sum;
    }
}