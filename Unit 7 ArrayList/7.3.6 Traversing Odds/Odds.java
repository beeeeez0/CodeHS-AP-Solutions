import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        // Pre-load the array list with values.
        for(int index = 1; index < 40; index ++)
        {
            evens.add(index);
            evens.add(index);
        }
        // Call removeOdds on the ArrayList above

        removeOdds(evens);

        // Print the ArrayList to verify the even numbers have been removed
        int i = 0;
        while(i < evens.size()) {
            System.out.println(evens.get(i));
            i++;
        }

    }

    public static void removeOdds(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 != 0) {
                array.remove(i);
                i--;
            }
        }

    }
}