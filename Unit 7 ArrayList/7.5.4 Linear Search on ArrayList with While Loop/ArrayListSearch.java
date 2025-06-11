import java.util.ArrayList;

public class ArrayListSearch
{
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Liam");
        array.add("Olivia");
        array.add("Noah");
        array.add("Emma");
        array.add("Oliver");
        array.add("Charlotte");
        System.out.println(search(array, "Olivia"));
    }

    public static int search(ArrayList<String> array, String key)
    {
        for(int i = 0; i < array.size(); i++)
        {
            String element = array.get(i);
            if(element == key)
            {
                return i;
            }
        }
        return -1;
    }
}